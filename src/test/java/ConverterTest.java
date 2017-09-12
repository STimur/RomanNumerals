import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    private Converter converter;

    @Before
    public void setUp() throws Exception {
        converter = new Converter();
    }

    private void assertConverts(Integer n, String expected) {
        assertEquals(expected, converter.convert(n));
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
    public void convertNinety() throws Exception {
        assertConverts(90, "XC");
    }

    @Test
    public void convertHundred() throws Exception {
        assertConverts(100, "C");
    }

    @Test
    public void convertFourHundred() throws Exception {
        assertConverts(400, "CD");
    }

    @Test
    public void convertFiveHundred() throws Exception {
        assertConverts(500, "D");
    }

    @Test
    public void convertNineHundred() throws Exception {
        assertConverts(900, "CM");
    }

    @Test
    public void convertThousand() throws Exception {
        assertConverts(1000, "M");
    }

    @Test
    public void randomTest() throws Exception {
        assertConverts(29, "XXIX");
        assertConverts(33, "XXXIII");
        assertConverts(39, "XXXIX");
        assertConverts(84, "LXXXIV");
        assertConverts(101, "CI");
        assertConverts(384, "CCCLXXXIV");
        assertConverts(846, "DCCCXLVI");
        assertConverts(1999, "MCMXCIX");
        assertConverts(2008, "MMVIII");
    }
}
