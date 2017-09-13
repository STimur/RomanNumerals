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
}
