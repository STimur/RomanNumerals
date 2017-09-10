import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
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

    private String convert(Integer n) {
        if (n == null)
            return "";
        return "I";
    }
}
