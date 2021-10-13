package parser.impl;

import parser.StringListToIntArrayParserInterface;

public class StringLineToIntArrayParser implements StringListToIntArrayParserInterface {
    private static final String NUMBER_SPLITER = ";";

    @Override
    public int[] parse(String line) {
        String[] stringArray = line.split(NUMBER_SPLITER);
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }
}
