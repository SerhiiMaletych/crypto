package petApp.crypto.coders;

import org.springframework.stereotype.Service;

@Service
public class VigenereCodec implements Decoder, Encoder {

    private static final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String KEY = "AB";


    @Override
    public String encode(String input) {
        StringBuilder letters = new StringBuilder();
        input = input.toUpperCase();
        for (int i = 0, j = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            char keySymbol = KEY.charAt(j);
            int newIndex = (ALPHABET.indexOf(symbol) + ALPHABET.indexOf(keySymbol)) % ALPHABET.length();
            char newSymbol = ALPHABET.charAt(newIndex);
            letters.append(newSymbol);
            j = ++j % KEY.length();
        }
        return letters.toString().toLowerCase();
    }


    @Override
    public String decode(String input) {
        StringBuilder letters = new StringBuilder();
        input = input.toUpperCase();
        for (int i = 0, j = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
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
