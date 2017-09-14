import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConverterTest {
    private void assertConverts(int n, String expected) {
        assertEquals(expected, Converter.convert(n));
    }

    @Test
    public void convertOne() throws Exception {
        assertConverts(1, "I");
    }

    @Test
    public void convertTwo() throws Exception {
        assertConverts(2, "II");
    }

    @Test
    public void convertThree() throws Exception {
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
    public void convertSix() throws Exception {
        assertConverts(6, "VI");
    }

    @Test
    public void convertSeven() throws Exception {
        assertConverts(7, "VII");
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
    public void convertElevenToThirteen() throws Exception {
        assertConverts(11, "XI");
        assertConverts(12, "XII");
        assertConverts(13, "XIII");
    }

    @Test
    public void convertFourty() throws Exception {
        assertConverts(40, "XL");
    }

    @Test
    public void convertFourtyOneToFourtyNine() throws Exception {
        assertConverts(41, "XLI");
        assertConverts(42, "XLII");
        assertConverts(44, "XLIV");
        assertConverts(45, "XLV");
        assertConverts(46, "XLVI");
        assertConverts(49, "XLIX");
    }

    @Test
    public void remainingSimpleConversions() throws Exception {
        assertConverts(50, "L");
        assertConverts(90, "XC");
        assertConverts(100, "C");
        assertConverts(400, "CD");
        assertConverts(500, "D");
        assertConverts(900, "CM");
        assertConverts(1000, "M");
    }
}
