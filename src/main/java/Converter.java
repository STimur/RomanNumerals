public class Converter {
    private static String[] dictionary = new String[]{"I", "II", "III"};

    public static String convert(int n) {
        return dictionary[n-1];
    }
}
