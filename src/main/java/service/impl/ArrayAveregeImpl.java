package service.impl;

import service.ArrayAverege;

public class ArrayAveregeImpl implements ArrayAverege {

    @Override
    public double arrayAverage(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum+= number;
        }
        return (double)(sum / array.length);
    }

}
