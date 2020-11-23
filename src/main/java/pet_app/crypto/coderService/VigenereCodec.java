package pet_app.crypto.coderService;

import org.springframework.stereotype.Service;
import pet_app.crypto.model.Input;

@Service
public class VigenereCodec implements Decoder, Encoder {

    private static final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String KEY = "AB";


    @Override
    public String encode(Input input) {
        StringBuilder letters = new StringBuilder();
        String input1 = input.getInput().toUpperCase();
        for (int i = 0, j = 0; i < input1.length(); i++) {
            char symbol = input1.charAt(i);
            char keySymbol = KEY.charAt(j);
            int newIndex = (ALPHABET.indexOf(symbol) + ALPHABET.indexOf(keySymbol)) % ALPHABET.length();
            char newSymbol = ALPHABET.charAt(newIndex);
            letters.append(newSymbol);
            j = ++j % KEY.length();
        }
        return letters.toString().toLowerCase();
    }


    @Override
    public String decode(Input input) {
        StringBuilder letters = new StringBuilder();
        String input1 = input.getInput().toUpperCase();
        for (int i = 0, j = 0; i < input1.length(); i++) {
            char symbol = input1.charAt(i);
            char keySymbol = KEY.charAt(j);
            int newIndex =
                    (ALPHABET.indexOf(symbol) - ALPHABET.indexOf(keySymbol))
                            % ALPHABET.length();
            char newSymbol = ALPHABET.charAt(newIndex);
            letters.append(newSymbol);
            j = ++j % KEY.length();
        }
        return letters.toString().toLowerCase();
    }
}
