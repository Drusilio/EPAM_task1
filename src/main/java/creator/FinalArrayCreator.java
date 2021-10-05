package creator;

import reader.ArrayReader;
import creator.impl.FinalArrayCreatorInterface;
import parser.StringListToIntArrayParser;
import entity.FinalArray;
import exception.IntFormatException;

import java.util.List;

public class FinalArrayCreator implements FinalArrayCreatorInterface {
    public FinalArray createFinalArray() throws IntFormatException {
        FinalArray finalArray = new FinalArray();
        List<String> stringList = ArrayReader.getList();
        int[] array = StringListToIntArrayParser.stringListToIntArrayParser(stringList);
        finalArray.setArray(array);

        return finalArray;
    }

    public FinalArray createFinalArray(int[] array) {
        return new FinalArray(array);
    }
}
