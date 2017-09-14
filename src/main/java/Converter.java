import java.util.*;

public class Converter {
    private static Map<Integer, String> dictionary = new LinkedHashMap<>();

    static {
        dictionary.put(40, "XL");
        dictionary.put(10, "X");
        dictionary.put(9, "IX");
        dictionary.put(5, "V");
        dictionary.put(4, "IV");
        dictionary.put(1, "I");
    }

    public static String convert(int n) {
        String result = "";

        for (Integer key : dictionary.keySet())
            for (; n >= key; result += dictionary.get(key), n -= key) ;

        return result;
    }
}
