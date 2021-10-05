package logger;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ArrayLogger {
    private static Logger logger = LogManager.getLogger();
    private ArrayLogger() {}
    public static Logger getArrayLogger() {
        return logger;
    }
}
