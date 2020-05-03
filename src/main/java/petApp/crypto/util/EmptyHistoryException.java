package petApp.crypto.util;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class EmptyHistoryException extends Exception {
    private Logger logger = Logger.getLogger("MyLog");

    public EmptyHistoryException() {
        logger.warning("There were no operations before, searching can't be done");
        System.out.println("....................................................");
    }


}
