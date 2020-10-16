package pet_app.crypto.coders;

import org.springframework.stereotype.Service;

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
        InputStream ip =  MorseCodec.class.
                getClassLoader().getResourceAsStream("morseEncode.properties");
        setPropertyToMap(ip, encodeMap);
    }

    private void putDecode() throws IOException {

        InputStream ip =  MorseCodec.class.
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
    @Override
    public String encode(String input) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            ret.append(encodeMap.get(input.charAt(i) + ""));
            ret.append(" ");
        }
        return ret.toString().trim();
    }

    @Override
    public String decode(String input) {
        String[] letters = input.split(" ");
        StringBuilder ret = new StringBuilder();
        Arrays.stream(letters).forEach(s -> ret.append(decodeMap.get(s)));
        return ret.toString();
    }
}
