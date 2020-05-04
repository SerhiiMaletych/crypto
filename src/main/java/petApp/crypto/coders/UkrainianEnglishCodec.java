package petApp.crypto.coders;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@Component
public class UkrainianEnglishCodec implements Decoder, Encoder {
    private DataForUkrEng ukrEngCodec;

    {
        ukrEngCodec = new DataForUkrEng();
    }


    @Override
    public String encode(String input) {
        return Arrays.stream(input.toLowerCase().split(" "))
                .map(t -> DataForUkrEng.engToUkrDictionary.getOrDefault(t.trim(),
                        "Illegal input. Words" + "[" + input + "]" + "are absent in UA to EN dictionary"))
                .collect(Collectors.joining(" "));
    }

    @Override
    public String decode(String input) {
        return Arrays.stream(input.toLowerCase().split(" "))
                .map(t -> DataForUkrEng.ukrToEngDictionary.getOrDefault(t.trim(),
                        "Illegal input. Words" + "[" + input + "]" + "are absent in UA to EN dictionary"))
                .collect(Collectors.joining(" "));
    }


    public DataForUkrEng getUkrEngCodec() {
        return ukrEngCodec;
    }

    public void setUkrEngCodec(DataForUkrEng ukrEngCodec) {
        this.ukrEngCodec = ukrEngCodec;
    }
}
