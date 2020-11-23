package pet_app.crypto.coderService;

import org.springframework.stereotype.Service;
import pet_app.crypto.model.Input;


@Service
public class CaesarCodec {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private final int shift=3;



    public String encode(Input input1) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < input1.getInput().length(); i++) {
            ret.append(ALPHABET.charAt((ALPHABET.indexOf(input1.getInput().charAt(i)) + shift) % ALPHABET.length()));
        }
        return ret.toString();
    }

    public String decode(Input input1)
    {
        StringBuilder ret = new StringBuilder();
        input1.getInput().chars().forEach(c ->
                ret.append(ALPHABET.charAt((ALPHABET.indexOf((char)c) - shift + ALPHABET.length()) % ALPHABET.length())));
        return ret.toString();
    }


}
