package validator;

import exception.IntFormatException;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {
    private static final StringValidator instance = new StringValidator();
    //                                                                    \d	цифровой символ
    //                                                                    ?	один или отсутствует
    //                                                                    {n}	n раз
    //
    private static final String STRING_AS_INT_OVERFLOW_CANDIDATE_REGEX = "-?\\d{10}";
    private static final String MAX_INT_VALUE = String.valueOf(Integer.MAX_VALUE);
    private static final String MIN_INT_VALUE = String.valueOf(Integer.MIN_VALUE);

    private StringValidator() {
    }

    public static StringValidator getInstance() {
        return instance;
    }

       public boolean validate(String stringAsIntArray) {

        Pattern pattern = Pattern.compile(STRING_AS_INT_ARRAY_REGEX);
        Matcher matcher = pattern.matcher(stringAsIntArray);

        boolean isValid;
        isValid = matcher.matches();

        if (isValid) {
            isValid = additionalValidateToIntOverflow(stringAsIntArray);
        }

        return isValid;
    }

    //	cheсk only the substring which containes an int overflow candidate
    //	3000000000 - will check
    //	-300000000 - will not check
    private boolean additionalValidateToIntOverflow(String stringAsIntArray) {

        boolean isValid = true;

        Pattern pattern = Pattern.compile(STRING_AS_INT_OVERFLOW_CANDIDATE_REGEX);
        Matcher matcher = pattern.matcher(stringAsIntArray);

        while (matcher.find()) {
            String candidate = matcher.group();

            if (candidate.compareTo(MAX_INT_AS_STRING) > 0 || candidate.compareTo(MIN_INT_AS_STRING) > 0) {
                isValid = false;
                break;
            }
        }

        return isValid;
    }

}
