package service.impl;

import service.PositiveAndNegativeCounterInterface;

public class PositiveAndNegativeCounter implements PositiveAndNegativeCounterInterface {
    public int positiveCounter(int[] array) {
        int negCount = 0;
        for (int number : array) {
            if (number > 0) {
                negCount++;
            }
        }
        return negCount;
    }

    public int negativeCounter(int[] array) {
        int posCount = 0;
        for (int number : array) {
            if (number < 0) {
                posCount++;
            }
        }
        return posCount;
    }

}
