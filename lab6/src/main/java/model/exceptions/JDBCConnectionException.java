package model.exceptions;

/**
 * @author Artsiom Maroz
 */

public class JDBCConnectionException extends Exception {
    /**
     * Constructor with specified string
     *
     * @param message string
     */
    public JDBCConnectionException(String message) {
        super(message);
    }

    /**
     * Constructor with specified string and exception
     *
     * @param message string
     * @param e       error covered
     */
    public JDBCConnectionException(String message, Throwable e) {
        super(message, e);
    }

    /**
     * Returns exception's message
     */
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    /**
     * Prints exception's stacktrace
     */
    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

}
