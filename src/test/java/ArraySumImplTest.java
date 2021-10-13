import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import parser.impl.StringLineToIntArrayParser;
import service.impl.ArraySumImpl;

public class ArraySumImplTest {
    ArraySumImpl arraySumImpl;
    private int[] array = {1, 2, -7, 69};
    private int expectedSum = 65;

    @Before
    public void initialize() {
        arraySumImpl = new ArraySumImpl();
    }

    @Test
    public void arraySumShouldBeEqualExpectedSum() {
        int arraySum = arraySumImpl.sum(array);
        Assert.assertEquals(expectedSum, arraySum);
    }

}
