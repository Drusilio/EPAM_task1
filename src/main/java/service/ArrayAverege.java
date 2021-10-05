package service;

import service.inteface.ArrayAveregeInterface;

public class ArrayAverege implements ArrayAveregeInterface {
    public double arrayAverage(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum+= number;
        }
        return (double)(sum / array.length);
    }

}
