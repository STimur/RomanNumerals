import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    private void assertConverts(int n, String expected) {
        assertEquals(expected, Converter.convert(n));
    }

    @Test
    public void simpleConversions() throws Exception {
        assertConverts(1, "I");
        assertConverts(4, "IV");
        assertConverts(5, "V");
        assertConverts(9, "IX");
        assertConverts(10, "X");
        assertConverts(40, "XL");
        assertConverts(50, "L");
        assertConverts(90, "XC");
        assertConverts(100, "C");
        assertConverts(400, "CD");
        assertConverts(500, "D");
        assertConverts(900, "CM");
        assertConverts(1000, "M");
    }

    @Test
    public void complexConversions() throws Exception {
        assertConverts(2, "II");
        assertConverts(3, "III");
        assertConverts(6, "VI");
        assertConverts(7, "VII");
        assertConverts(11, "XI");
        assertConverts(12, "XII");
        assertConverts(13, "XIII");
        assertConverts(41, "XLI");
        assertConverts(42, "XLII");
        assertConverts(44, "XLIV");
        assertConverts(45, "XLV");
        assertConverts(46, "XLVI");
        assertConverts(49, "XLIX");
    }

    @Test
    public void acceptanceTest() throws Exception {
        assertConverts(449, "CDXLIX");
        assertConverts(846, "DCCCXLVI");
        assertConverts(1589, "MDLXXXIX");
        assertConverts(1999, "MCMXCIX");
        assertConverts(2008, "MMVIII");
    }
}
