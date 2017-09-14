import java.util.*;

public class Converter {
    private static Map<Integer, String> dictionary = new LinkedHashMap<>();

    static {
        dictionary.put(1000, "M");
        dictionary.put(500, "D");
        dictionary.put(100, "C");
        dictionary.put(50, "L");
        dictionary.put(10, "X");
        dictionary.put(5, "V");
        dictionary.put(1, "I");
    }

    public static String convert(int n) {
        String result = "";

        int div = dictionary.keySet().iterator().next()/10;
        Integer prevKey = null;
        for (Integer key : dictionary.keySet()) {
            for (; n >= key; ) {
                if (prevKey != null && n + div >= prevKey) {
                    result += dictionary.get(div) + dictionary.get(prevKey);
                    n -= prevKey - div;
                } else {
                    result += dictionary.get(key);
                    n -= key;
                }
            }
            prevKey = key;
            if (div == prevKey)
                div /= 10;
        }

        return result;
    }
}
