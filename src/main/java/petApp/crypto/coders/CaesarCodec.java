package petApp.crypto.coders;


import org.springframework.stereotype.Service;

@Service
public class CaesarCodec implements Decoder, Encoder {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz ";
    private int shift=3;



    @Override
    public String encode(String input) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            ret.append(ALPHABET.charAt((ALPHABET.indexOf(input.charAt(i)) + shift) % ALPHABET.length()));
        }
        return ret.toString();
    }

    @Override
    public String decode(String input) {
        StringBuilder ret = new StringBuilder();
        input.chars().forEach(c ->
                ret.append(ALPHABET.charAt((ALPHABET.indexOf((char)c) - shift + ALPHABET.length()) % ALPHABET.length())));
        return ret.toString();
    }
}
