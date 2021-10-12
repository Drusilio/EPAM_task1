package service.impl;

import service.PositiveAndNegativeCounter;

public class PositiveAndNegativeCounterImpl implements PositiveAndNegativeCounter {

    @Override
    public int positiveCounter(int[] array) {
        int negCount = 0;
        for (int number : array) {
            if (number > 0) {
                negCount++;
            }
        }
        return negCount;
    }

    @Override
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
