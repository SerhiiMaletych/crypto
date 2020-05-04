package petApp.crypto;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import petApp.crypto.coders.UkrainianEnglishCodec;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UkrainianEnglishCodecTest {
    @Autowired
    UkrainianEnglishCodec ukr;

    @Test
    public void testEncode() {
        String expected = "будинок";
        assertEquals(ukr.encode("house"), expected);
    }

    @Test
    public void testDecode() {
        String expected = "house";
        assertEquals(ukr.decode("будинок"), expected);
    }

    @Test
    public void testEncodeMultipleWords() {
        String expected = "будувати високий будинок";
        assertEquals(ukr.encode("build high house"), expected);
    }

    @Test
    public void testDecodeMultipleWords() {
        String expected = "build high house";
        assertEquals(ukr.decode("будувати високий будинок"), expected);
    }


}
