package creator;

import entity.FinalArray;
import exception.IntFormatException;

public interface FinalArrayCreatorInterface {

    public FinalArray createFinalArray() throws IntFormatException;

    public FinalArray createFinalArray(int[] array);

}
