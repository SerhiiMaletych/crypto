package pet_app.crypto.codec;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pet_app.crypto.coderService.MorseCodec;
import pet_app.crypto.model.Input;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class MorseCodecTests {

    @Autowired
    MorseCodec morseCodec;

    @Test
    public void testEncode() {
        Input input = new Input("hello");
        String expected = "..../ ./ .-../ .-../ ---/";
        assertEquals(morseCodec.encode(input), expected);
    }

    @Test
    public void testDecode() {
        Input input = new Input("..../ ./ .-../ .-../ ---/");
        String expected = "hello";
        assertEquals(morseCodec.decode(input), expected);
    }

    @Test
    public void testEncodeMultipleWords() {
        Input input = new Input("hello world");
        String expected = "..../ ./ .-../ .-../ ---/ ......./ .--/ ---/ .-./ .-../ -../";
        assertEquals(morseCodec.encode(input), expected);
    }

    @Test
    public void testDecodeMultipleWords() {
        Input input = new Input("..../ ./ .-../ .-../ ---/ ......./ .--/ ---/ .-./ .-../ -../");
        String expected = "hello world";
        assertEquals(morseCodec.decode(input), expected);
    }


}
