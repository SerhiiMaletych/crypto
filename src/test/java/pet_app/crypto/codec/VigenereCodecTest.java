package pet_app.crypto.codec;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pet_app.crypto.coderService.VigenereCodec;
import pet_app.crypto.model.Input;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class VigenereCodecTest {
    @Autowired
    VigenereCodec vigenereCodec;

    @Test
    public void testEncode() {
        Input input = new Input("hello");
        String expected = "hfnlp";
        assertEquals(vigenereCodec.encode(input), expected);

    }

    @Test
    public void testDecode() {
        Input input = new Input("hfnlp");
        String expected = "hello";
        assertEquals(vigenereCodec.decode(input), expected);
    }

    @Test
    public void testEncodeMultipleWords() {
        Input input = new Input("hello world");
        String expected = "hfnlp<wptle";
        assertEquals(vigenereCodec.encode(input), expected);

    }

    @Test
    public void testDecodeMultipleWords() {
        Input input = new Input("hfnlp<wptle");
        String expected = "hellotworld";
        assertEquals(vigenereCodec.decode(input), expected);
    }
}
