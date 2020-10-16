package pet_app.crypto.coderService;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public interface Encoder {
    String encode(String input) throws IOException, InterruptedException;
}
