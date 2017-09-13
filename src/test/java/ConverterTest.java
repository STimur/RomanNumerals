import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    @Test
    public void convertOne() throws Exception {
        assertEquals("I", Converter.convert(1));
    }

    @Test
    public void convertTwo() throws Exception {
        assertEquals("II", Converter.convert(2));
    }
}
