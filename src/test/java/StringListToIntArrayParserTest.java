import reader.impl.ArrayReader;
import exception.UserException;
import org.junit.Test;
import org.junit.Assert;
import validator.StringValidator;

public class StringListToIntArrayParserTest {
    @Test
    public void isValuesInt() {
        try {
            Assert.assertTrue(StringValidator.isValid(ArrayReader.getList()));
        } catch (UserException e) {
            e.printStackTrace();
        }
    }
}
