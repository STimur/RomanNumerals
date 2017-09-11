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

    private String convert(Integer n) {
        if (n == null)
            return "";
        if (n > 3)
            return "III".substring(0, 5 - n) + "V";
        return "III".substring(0, n);
    }
}
