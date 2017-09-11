import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    private static int[] keys = new int[7];
    private static String[] dictionary = new String[7];

    static {
        keys[0] = 1;
        dictionary[0] = "I";
        keys[1] = 4;
        dictionary[1] = "IV";
        keys[2] = 5;
        dictionary[2] = "V";
        keys[3] = 9;
        dictionary[3] = "IX";
        keys[4] = 10;
        dictionary[4] = "X";
        keys[5] = 40;
        dictionary[5] = "XL";
        keys[6] = 50;
        dictionary[6] = "L";
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

    @Test
    public void convertFourty() throws Exception {
        assertConverts(40, "XL");
    }

    @Test
    public void convertFifty() throws Exception {
        assertConverts(50, "L");
    }

    @Test
    public void randomTest() throws Exception {
        assertConverts(29, "XXIX");
        assertConverts(33, "XXXIII");
        assertConverts(39, "XXXIX");
        assertConverts(84, "LXXXIV");
    }

    private String convert(Integer n) {
        if (n == null)
            return "";

        return convert(n, keys.length - 1);
    }

    private String convert(int n, int keyIndex) {
        if (n == 0)
            return "";
        return String.join("", Collections.nCopies(n/keys[keyIndex], dictionary[keyIndex])) +
                convert(n - n/keys[keyIndex]*keys[keyIndex], keyIndex-1);
    }
}
