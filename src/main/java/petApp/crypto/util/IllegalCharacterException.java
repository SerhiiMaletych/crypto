package petApp.crypto.util;


import org.springframework.stereotype.Component;

@Component
public class IllegalCharacterException extends Exception {


    public IllegalCharacterException(String message) {
        super(message);
    }

}
