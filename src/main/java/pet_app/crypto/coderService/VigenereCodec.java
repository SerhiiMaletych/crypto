package pet_app.crypto.coderService;

import org.springframework.stereotype.Service;
import pet_app.crypto.model.Input;

@Service
public class VigenereCodec implements Decoder, Encoder {

    private static final String KEY = "AB";


    @Override
    public String encode(Input input) {
        String EMessage = "";
        String input1 = input.getInput().toUpperCase();
        for (int i = 0, j = 0; i < input1.length(); i++) {
            char letter = input1.charAt(i);
            EMessage += (char) (((letter - 65) + (KEY.charAt(j) - 65)) % 26 + 65);
            j = ++j % KEY.length();
        }
        return EMessage;
    }

        @Override
        public String decode (Input input){
            String DMessage = "";
            String input1 = input.getInput().toUpperCase();
            for (int i = 0, j = 0; i < input1.length(); i++) {
                char letter = input1.charAt(i);
                DMessage += (char) ((letter - KEY.charAt(j) + 26) % 26 + 65);
                j = ++j % KEY.length();
            }
            return DMessage;
        }
    }

