/**
 * Created by genius on 4/1/2016.
 */
public class InvalidFileException extends Exception {

    public InvalidFileException() {

    }

    public InvalidFileException(String message) {
        super(message);
    }

    public InvalidFileException(Throwable cause) {
        super(cause);
    }

    public InvalidFileException(String message, Throwable cause) {
        super(message, cause);
    }
}

