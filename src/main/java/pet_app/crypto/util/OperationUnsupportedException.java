package pet_app.crypto.util;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class OperationUnsupportedException extends Exception {
    private Logger logger = Logger.getLogger("MyLog");

    public OperationUnsupportedException() {
        logger.warning("You have chosen wrong operation, please try one more time");
        System.out.println("...............................");
    }


}
