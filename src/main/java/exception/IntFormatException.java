package exception;


public class IntFormatException extends Exception {


    public IntFormatException() {
    }

    public IntFormatException(String message) {
        super(message);
    }

    public IntFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public IntFormatException(Throwable cause) {
        super(cause);
    }

    public IntFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
