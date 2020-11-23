package pet_app.crypto.coderService;

import org.springframework.stereotype.Service;
import pet_app.crypto.model.Input;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

@Service
public class MorseCodec implements Decoder, Encoder {
    private HashMap<String, String> encodeMap = new HashMap<>();
    private HashMap<String, String> decodeMap = new HashMap<>();
    private Properties propertyFile = new Properties();

    @Override
    public String encode(Input input) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < input.getInput().length(); i++) {
            ret.append(encodeMap.get(input.getInput().charAt(i) + ""));
            ret.append(" ");
        }
        return ret.toString().trim();
    }

    @Override
    public String decode(Input input) {
        String[] letters = input.getInput().split(" ");
        StringBuilder ret = new StringBuilder();
        Arrays.stream(letters).forEach(s -> ret.append(decodeMap.get(s)));
        return ret.toString();
    }

    private void setPropertyToMap(InputStream ip, HashMap<String, String> encodeMap) throws IOException {
        propertyFile.load(ip);
        Set<Object> keys = propertyFile.keySet();
        for (Object k : keys) {
            String key = (String) k;
            String value = propertyFile.getProperty(key);
            encodeMap.put(key, value);
        }
        ip.close();
    }

    private void putEncode() throws IOException {
        InputStream ip = MorseCodec.class.
                getClassLoader().getResourceAsStream("morseEncode.properties");
        setPropertyToMap(ip, encodeMap);
    }

    private void putDecode() throws IOException {

        InputStream ip = MorseCodec.class.
                getClassLoader().getResourceAsStream("morseDecode.properties");
        setPropertyToMap(ip, decodeMap);
    }

    public MorseCodec() {
        try {
            putDecode();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            putEncode();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
