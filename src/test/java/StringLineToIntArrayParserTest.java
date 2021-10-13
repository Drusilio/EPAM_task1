import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import parser.impl.StringLineToIntArrayParser;

public class StringLineToIntArrayParserTest {
    StringLineToIntArrayParser stringLineToIntArrayParser;
    String testLine = "65;78;-98;0;86443";
    int[] expectedArray = {65, 78, -98, 0, 86443};

    @Before
    public void initialize() {
        stringLineToIntArrayParser = new StringLineToIntArrayParser();
    }

    @Test
    public void resultArrayShlouldBeEqualsExpectedArray() {
        Assert.assertArrayEquals(expectedArray, stringLineToIntArrayParser.parse(testLine));
    }

}
