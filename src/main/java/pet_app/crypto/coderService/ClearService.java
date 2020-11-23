package pet_app.crypto.coderService;

import org.springframework.stereotype.Service;
import pet_app.crypto.model.Input;

@Service
public class ClearService {

    public Input clearResult(Input input) {
        input.setInput("");
        return input;
    }
}
