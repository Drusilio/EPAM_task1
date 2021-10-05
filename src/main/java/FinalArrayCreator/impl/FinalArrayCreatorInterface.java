package FinalArrayCreator.impl;

import ArrayReader.ArrayReader;
import StringToIntParser.StringListToIntArrayParser;
import entity.FinalArray;
import exception.IntFormatException;

import java.util.List;

public interface FinalArrayCreatorInterface {

    public FinalArray createFinalArray() throws IntFormatException;

    public FinalArray createFinalArray(int[] array);

}
