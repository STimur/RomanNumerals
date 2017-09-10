import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    private String convert(Integer n) {
        return "";
    }

    @Test
    public void nullConvertedToEmptyString() throws Exception {
        assertEquals("", convert(null));
    }


}
