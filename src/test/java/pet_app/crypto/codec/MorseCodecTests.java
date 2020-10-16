package pet_app.crypto.codec;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pet_app.crypto.coderService.MorseCodec;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MorseCodecTests {

    @Autowired
    MorseCodec morseCodec;

    @Test
    public void testEncode() {
        String expected = "..../ ./ .-../ .-../ ---/";
        assertEquals(morseCodec.encode("hello"), expected);
    }

    @Test
    public void testDecode() {
        String expected = "hello";
        assertEquals(morseCodec.decode("..../ ./ .-../ .-../ ---/"), expected);
    }

    @Test
    public void testEncodeMultipleWords() {
        String expected = "..../ ./ .-../ .-../ ---/ ......./ .--/ ---/ .-./ .-../ -../";
        assertEquals(morseCodec.encode("hello world"), expected);
    }

    @Test
    public void testDecodeMultipleWords() {
        String expected = "hello world";
        assertEquals(morseCodec.decode("..../ ./ .-../ .-../ ---/ ......./ .--/ ---/ .-./ .-../ -../"), expected);
    }
}
