package service;

import service.inteface.PositiveAndNegativeCounterInterface;

public class PositiveAndNegativeCounter implements PositiveAndNegativeCounterInterface {
    public static int positiveCounter(int[] array) {
        int negCount = 0;
        for (int number : array) {
            if (number > 0) {
                negCount++;
            }
        }
        return negCount;
    }

    public static int negativeCounter(int[] array) {
        int posCount = 0;
        for (int number : array) {
            if (number < 0) {
                posCount++;
            }
        }
        return posCount;
    }

}
