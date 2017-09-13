import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    @Test
    public void convertOne() throws Exception {
        assertEquals("I", Converter.convert(1));
    }
}
