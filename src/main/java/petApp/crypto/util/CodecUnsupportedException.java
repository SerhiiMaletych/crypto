package petApp.crypto.util;


import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CodecUnsupportedException extends Exception {
    private Logger logger = Logger.getLogger("MyLog");

    public CodecUnsupportedException() {
        logger.warning("Wrong codec, please try one more time");
        System.out.println(".....................................");
    }

}
