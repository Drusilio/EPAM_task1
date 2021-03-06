package service.impl;

public class MinAndMaxImpl implements service.MinAndMax {

    @Override
    public int minFromArray(int[] array) {
        int indexOfMax = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            }
        }
        return array[indexOfMax];
    }

    @Override
    public int maxFromArray(int[] array) {
        int indexOfMin = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        return array[indexOfMin];
    }

}
