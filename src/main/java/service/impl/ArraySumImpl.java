package service.impl;

import service.ArraySum;

public class ArraySumImpl implements ArraySum {
    @Override
    public int sum(int[] array) {
        int sum = 0;
        for (int currentNumber : array) {
            sum += currentNumber;
        }
        return sum;
    }
}
