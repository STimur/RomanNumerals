import java.util.HashMap;
import java.util.Map;

public class Converter {
    private static Map<Integer, String> dictionary = new HashMap<>();

    static {
        dictionary.put(1, "I");
        dictionary.put(4, "IV");
        dictionary.put(5, "V");
        dictionary.put(9, "IX");
        dictionary.put(10, "X");
        dictionary.put(40, "XL");
    }

    public static String convert(int n) {
        if (dictionary.containsKey(n))
            return dictionary.get(n);
        if (n > 10)
            return dictionary.get(10) + convert(n-10);
        if (n > 5)
            return dictionary.get(5) + convert(n-5);

        return dictionary.get(1) + convert(n-1);
    }
}
