import ArrayReader.ArrayReader;
import StringToIntParser.StringListToIntArrayParser;
import exception.IntFormatException;
import org.junit.Test;
import org.junit.Assert;
import validator.IntValidator;

public class StringListToIntArrayParserTest {
    @Test
    public void isValuesInt() {
        try {
            Assert.assertTrue(IntValidator.isValid(ArrayReader.getList()));
        } catch (IntFormatException e) {
            e.printStackTrace();
        }
    }
}
