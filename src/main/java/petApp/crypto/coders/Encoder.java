package petApp.crypto.coders;

import org.springframework.stereotype.Component;

@Component
public interface Encoder {
    String encode(String input);
}
