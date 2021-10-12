package validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {
    //                                                                    - минус
    //                                                                    ?	один или отсутствует (относится к минусу)
    //                                                                    \d	цифровой символ
    //                                                                    {n}	n раз
    //                                                                    то есть ниже ищем до 10-ти цифровых символов подряд с/без знака минус перед ним
    private static final String STRING_TO_INT_LINE_REGEX = "(-?\\d{1,10};)+";
    private static final String STRING_TO_INT_REGEX = "-?\\d{10}";
    private static final String MAX_INT_VALUE = "-2147483648";
    private static final String MIN_INT_VALUE = "2147483647";

    public static boolean validate(String arrayLine) {
        Pattern pattern = Pattern.compile(STRING_TO_INT_LINE_REGEX);
        Matcher matcher = pattern.matcher(arrayLine);

        boolean isValid;
        if (isValid = matcher.matches()) {
            isValid = intDiapasonValidation(arrayLine);
        }
        return isValid;
    }

    private static boolean intDiapasonValidation(String stringNumber) {
        boolean isValid = true;
        Pattern pattern = Pattern.compile(STRING_TO_INT_REGEX);
        Matcher matcher = pattern.matcher(stringNumber);

        while (matcher.find()) {
            String currentStr = matcher.group();
            if (currentStr.compareTo(MAX_INT_VALUE) > 0 || currentStr.compareTo(MIN_INT_VALUE) > 0) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

}
