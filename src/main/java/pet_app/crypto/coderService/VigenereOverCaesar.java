package pet_app.crypto.coderService;

import org.springframework.stereotype.Component;
import pet_app.crypto.model.Input;


@Component
public class VigenereOverCaesar implements Decoder, Encoder {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    private static final String ALPHABETLITTLE = "abcdefghijklmnopqrstuvwxyz ";
    private int shift = 3;
    private static final String KEY = "AB";


    @Override
    public String encode(Input input) {
        StringBuilder ret = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        for (int i = 0; i < input.getInput().length(); i++) {
            ret.append(ALPHABETLITTLE.charAt((ALPHABETLITTLE.indexOf(input.getInput().charAt(i)) +
                    shift) % ALPHABETLITTLE.length()));

        }
        String ref = ret.toString().toUpperCase();
        for (int a = 0, j = 0; a < ref.length(); a++) {
            char symbol = ref.charAt(a);
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
            int newIndex = (ALPHABET.indexOf(symbol) - ALPHABET.indexOf(keySymbol)) % ALPHABET.length();
            char newSymbol = ALPHABET.charAt(newIndex);
            letters.append(newSymbol);
            j = ++j % KEY.length();
        }
        String ref = letters.toString().toLowerCase();

        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < ref.length(); i++) {
            ret.append(ALPHABETLITTLE.charAt((ALPHABETLITTLE.indexOf(ref.charAt(i)) -
                    shift + ALPHABETLITTLE.length()) % ALPHABETLITTLE.length()));

        }
        return ret.toString();
    }
}