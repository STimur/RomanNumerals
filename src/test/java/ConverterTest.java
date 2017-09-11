import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    private static String[] dictionary = new String[16];

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

    @Test
    public void convertTen() throws Exception {
        assertConverts(10, "X");
    }

    @Test
    public void convertFourteen() throws Exception {
        assertConverts(14, "XIV");
    }

    @Test
    public void convertFifteenToTwenty() throws Exception {
        assertConverts(15, "XV");
        assertConverts(16, "XVI");
        assertConverts(17, "XVII");
        assertConverts(18, "XVIII");
        assertConverts(19, "XIX");
        assertConverts(20, "XX");
    }

    private String convert(Integer n) {
        if (n == null)
            return "";

        int tens = n / 10;
        int nines = (n - tens * 10) / 9;
        int fives = (n - tens * 10 - nines * 9) / 5;
        int fours = 0;
        if (fives == 0)
            fours = (n - tens * 10 - nines * 9 - fives * 5) / 4;
        int ones = (n - tens * 10 - nines * 9 - fives * 5 - fours * 4);

        return
                "XX".substring(0, tens) + ((nines == 1) ? "IX" : "") +
                        "V".substring(0, fives) + ((fours == 1) ? "IV" : "") +
                        "III".substring(0, ones);
    }
}
