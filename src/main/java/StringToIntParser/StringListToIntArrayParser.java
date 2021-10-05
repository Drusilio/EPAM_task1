package StringToIntParser;

import ArrayLogger.ArrayLogger;
import StringToIntParser.impl.StringListToIntArrayParserInterface;
import exception.IntFormatException;
import validator.IntValidator;

import java.util.List;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class StringListToIntArrayParser implements StringListToIntArrayParserInterface {
    static Logger logger = LogManager.getLogger();

    public static int[] stringListToIntArrayParser(List<String> list) throws IntFormatException {
        if(!IntValidator.isValid(list)) {
            ArrayLogger.getArrayLogger().info(
                    "В переданном файле присутсвует как минимум один элемент, не являющийся целым числом",
                    new IntFormatException());
        }

        int[] array = new int[list.size()];
        int i = 0;
        for (String str : list) {
                array[i] = Integer.valueOf(str);
        }
        return array;
    }
}
