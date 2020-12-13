package pet_app.crypto.exception;

public class ApiRequestException extends RuntimeException {
    public ApiRequestException(String messsage) {
        super(messsage);
    }

    public ApiRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}

