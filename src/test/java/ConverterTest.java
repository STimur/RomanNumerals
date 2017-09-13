import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
