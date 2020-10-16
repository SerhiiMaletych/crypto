package pet_app.crypto.codec;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pet_app.crypto.coderService.VigenereCodec;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VigenereCodecTest {
    @Autowired
    VigenereCodec vigenereCodec;

    @Test
    public void testEncode() {
        String expected = "igmnp";
        assertEquals(vigenereCodec.encode("hello"), expected);

    }

    @Test
    public void testDecode() {
        String expected = "hello";
        assertEquals(vigenereCodec.decode("igmnp"), expected);
    }

    @Test
    public void testEncodeMultipleWords() {
        String expected = "igmnpbxqsne";
        assertEquals(vigenereCodec.encode("hello world"), expected);

    }

    @Test
    public void testDecodeMultipleWords() {
        String expected = "hello world";
        assertEquals(vigenereCodec.decode("igmnpbxqsne"), expected);
    }
}
