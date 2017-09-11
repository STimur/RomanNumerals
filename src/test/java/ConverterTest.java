import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    private static String[] dictionary = new String[11];

    static {
        dictionary[5] = "V";
        dictionary[10] = "X";
    }

    private void assertConverts(Integer n, String expected) {
        assertEquals(expected, convert(n));
    }

    @Test
    public void nullConvertedToEmptyString() throws Exception {
        assertConverts(null, "");
    }

    @Test
    public void oneToThreeConversions() throws Exception {
        assertConverts(1, "I");
        assertConverts(2, "II");
        assertConverts(3, "III");
    }

    @Test
    public void convertFour() throws Exception {
        assertConverts(4, "IV");
    }

    @Test
    public void convertFive() throws Exception {
        assertConverts(5, "V");
    }

    @Test
    public void convertSixToEight() throws Exception {
        assertConverts(6, "VI");
        assertConverts(7, "VII");
        assertConverts(8, "VIII");
    }

    @Test
    public void convertNine() throws Exception {
        assertConverts(9, "IX");
    }

    private String convert(Integer n) {
        if (n == null)
            return "";

        if (dictionary[n + 1] != null)
            return "I" + dictionary[n + 1];
        return ((n / 5 == 1) ? "V" : "") + "III".substring(0, n%5);
    }
}
