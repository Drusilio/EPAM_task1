package creator.impl;

import creator.FinalArrayCreatorInterface;
import entity.FinalArray;

public class FinalArrayCreator implements FinalArrayCreatorInterface {

    @Override
    public FinalArray createFinalArray(int[] array) {
        return new FinalArray(array);
    }

    @Override
    public FinalArray createFinalArray() {
        return new FinalArray();
    }
}
