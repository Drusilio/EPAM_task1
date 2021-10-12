package entity;

import java.util.Arrays;

public class FinalArray {
    private int[] array;

    public FinalArray() {
    }

    public FinalArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return  Arrays.copyOf(this.array, array.length);
    }

    public void setArray(int[] array) {
        this.array =  Arrays.copyOf(array, array.length);
    }

    @Override
    public String toString() {
        return "FinalArray [array:" + array + "]";
    }
}
