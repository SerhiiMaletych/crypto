package pet_app.crypto.coderService;

import org.springframework.stereotype.Component;
import pet_app.crypto.model.Input;

import java.io.IOException;

@Component
public interface Decoder {

    String decode(String input) throws IOException, InterruptedException;
}
