package petApp.crypto.coders;

import org.springframework.stereotype.Component;

@Component
public interface Decoder {
    String decode(String input);
}
