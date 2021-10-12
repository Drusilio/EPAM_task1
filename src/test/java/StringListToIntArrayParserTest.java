import reader.impl.ArrayReader;
import exception.IntFormatException;
import org.junit.Test;
import org.junit.Assert;
import validator.StringValidator;

public class StringListToIntArrayParserTest {
    @Test
    public void isValuesInt() {
        try {
            Assert.assertTrue(StringValidator.isValid(ArrayReader.getList()));
        } catch (IntFormatException e) {
            e.printStackTrace();
        }
    }
}
