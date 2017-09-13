import java.util.HashMap;
import java.util.Map;

public class Converter {
    private static Map<Integer, String> dictionary = new HashMap<>();

    static {
        dictionary.put(1, "I");
        dictionary.put(4, "IV");
    }

    public static String convert(int n) {
        if (dictionary.containsKey(n))
            return dictionary.get(n);
        return dictionary.get(1) + convert(n-1);
    }
}
