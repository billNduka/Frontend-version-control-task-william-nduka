public class InvalidDateInputException extends Exception {

    public InvalidDateInputException(String message) {
        super(message);
    }

    public InvalidDateInputException(String message, Throwable cause) {
        super(message, cause);
    }
}