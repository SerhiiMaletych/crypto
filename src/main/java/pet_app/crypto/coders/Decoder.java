package pet_app.crypto.coders;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public interface Decoder {
    String decode(String input) throws IOException, InterruptedException;
}
