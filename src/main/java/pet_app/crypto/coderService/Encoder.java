package pet_app.crypto.coderService;

import org.springframework.stereotype.Component;
import pet_app.crypto.model.Input;

import java.io.IOException;

@Component
public interface Encoder {
    String encode(Input input) throws IOException, InterruptedException;
}
