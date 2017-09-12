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
    public void nullConversion() throws Exception {
        assertConverts(null, "");
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
        assertConverts(8, "VIII");
        assertConverts(14, "XIV");
        assertConverts(15, "XV");
        assertConverts(16, "XVI");
        assertConverts(17, "XVII");
        assertConverts(18, "XVIII");
        assertConverts(19, "XIX");
        assertConverts(20, "XX");
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
