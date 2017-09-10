import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    private static String[] dictionary = new String[1001];

    static {
        dictionary[1] = "I";
        dictionary[5] = "V";
    }

    private void assertConverts(Integer n, String expected) {
        assertEquals(expected, convert(n));
    }

    @Test
    public void nullConvertedToEmptyString() throws Exception {
        assertConverts(null, "");
    }

    @Test
    public void oneConvertedToI() throws Exception {
        assertConverts(1, "I");
    }

    @Test
    public void fiveConvertedToV() throws Exception {
        assertConverts(5, "V");
    }

    private String convert(Integer n) {
        if (n == null)
            return "";
        return dictionary[n];
    }
}
