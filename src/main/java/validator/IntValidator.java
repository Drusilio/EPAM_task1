package validator;

import exception.IntFormatException;

import java.util.List;

public class IntValidator {
    public static boolean isValid(List<String> list) throws IntFormatException {
        boolean flag = true;
        int i = 0;
        for (String str : list) {
            try {
                i = Integer.valueOf(str);
            } catch (NumberFormatException e) {
                flag = false;
                //throw new IntFormatException();
            }
        }
        return flag;
    }

}
