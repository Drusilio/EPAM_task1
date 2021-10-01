package service;

import service.inteface.ConditionChangesInterface;

public class ConditionChanges implements ConditionChangesInterface {

    public int[] conditionChange(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                array[i] = -1;
            }
        }

        return array;
    }
}
