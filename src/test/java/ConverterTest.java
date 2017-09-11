import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    private static String[] dictionary = new String[1002];

    static {
        dictionary[1] = "I";
        dictionary[5] = "V";
        dictionary[10] = "X";
        dictionary[50] = "L";
        dictionary[100] = "C";
        dictionary[500] = "D";
        dictionary[1000] = "M";
    }

    private void assertConverts(Integer n, String expected) {
        assertEquals(expected, convert(n));
    }

    @Test
    public void nullConvertedToEmptyString() throws Exception {
        assertConverts(null, "");
    }

    @Test
    public void oneSymbolConvertions() throws Exception {
        assertConverts(1, "I");
        assertConverts(5, "V");
        assertConverts(10, "X");
        assertConverts(50, "L");
        assertConverts(100, "C");
        assertConverts(500, "D");
        assertConverts(1000, "M");
    }

    @Test
    public void convertTwoToII() throws Exception {
        assertConverts(2, "II");
    }

    @Test
    public void convertThreeToIII() throws Exception {
        assertConverts(3, "III");
    }

    @Test
    public void convertFourToIV() throws Exception {
        assertConverts(4, "IV");
    }

    private String convert(Integer n) {
        if (n == null)
            return "";
        if (dictionary[n] == null) {
            if (n == 4)
                dictionary[n] = "IV";
            else
                dictionary[n] = "III".substring(0, n);
        }
        return dictionary[n];
    }
}
