package petApp.crypto.util;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class IllegalInputException extends Exception {

    private Logger logger = Logger.getLogger("MyLog");

    public IllegalInputException() {
        logger.warning("Wrong input, please try one more time");
        System.out.println(".....................................");
    }

}
