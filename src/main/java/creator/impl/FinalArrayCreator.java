package creator.impl;

import creator.FinalArrayCreatorInterface;
import entity.FinalArray;

public class FinalArrayCreator implements FinalArrayCreatorInterface {
       public FinalArray createFinalArray(int[] array) {
        return new FinalArray(array);
    }
}
