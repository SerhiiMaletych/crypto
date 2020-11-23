package pet_app.crypto.coderService;

import org.springframework.stereotype.Component;
import pet_app.crypto.model.Input;

import java.io.IOException;

@Component
public interface Decoder {

    String decode(Input input) throws IOException, InterruptedException;
}
