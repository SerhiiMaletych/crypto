package pet_app.crypto.coderService;

import org.springframework.stereotype.Service;
import pet_app.crypto.model.Input;


@Service
public class CaesarCodec implements Decoder, Encoder {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private final int shift=3;



    public String encode(Input input) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < input.getInput().length(); i++) {
            ret.append(ALPHABET.charAt((ALPHABET.indexOf(input.getInput().charAt(i)) + shift) % ALPHABET.length()));
        }
        return ret.toString();
    }

    public String decode(Input input)
    {
        StringBuilder ret = new StringBuilder();
        input.getInput().chars().forEach(c ->
                ret.append(ALPHABET.charAt((ALPHABET.indexOf((char)c) - shift + ALPHABET.length()) % ALPHABET.length())));
        return ret.toString();
    }


}
