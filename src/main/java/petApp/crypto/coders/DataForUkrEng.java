package petApp.crypto.coders;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Component
class DataForUkrEng {
    static Map<String, String> engToUkrDictionary = new HashMap<>();
    static Map<String, String> ukrToEngDictionary = new HashMap<>();
    private Properties propertyFile = new Properties();

    private Map<String, String> setPropertyToMap(InputStream ip, Map<String, String> engToUkrDictionary)
            throws IOException {
        propertyFile.load(ip);
        Set<Object> keys = propertyFile.keySet();

        for (Object k : keys) {
            String key = (String) k;
            String value = propertyFile.getProperty(key);
            engToUkrDictionary.put(key, value);
        }
        ip.close();
        return engToUkrDictionary;
    }
    private Map<String, String> putEncode() throws IOException {

        InputStream ip = DataForUkrEng.class.
                getClassLoader().getResourceAsStream("engUkr.properties");
        return setPropertyToMap(ip, engToUkrDictionary);
    }


    private Map<String, String> putDecode() throws IOException {
        InputStream ip = DataForUkrEng.class.
                getClassLoader().getResourceAsStream("UkrEng.properties");

        return setPropertyToMap(ip, ukrToEngDictionary);
    }

//    DataForUkrEng() {
//
//        try {
//            putDecode();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            putEncode();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

