package creator.impl;

import creator.FinalArrayCreatorInterface;
import reader.impl.ArrayReader;
import parser.impl.StringListToIntArrayParser;
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
