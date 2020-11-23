package pet_app.crypto.codec;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pet_app.crypto.coderService.VigenereOverCaesar;
import pet_app.crypto.model.Input;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VigenereOverCaesarTest {
    @Autowired
    VigenereOverCaesar vigenereOverCaesar;
    @Test
    public void testEncode() {
        Input input = new Input("hello");
        String expected = "kiopr";
        assertEquals(vigenereOverCaesar.encode(input), expected);
    }

    @Test
    public void testDecode() {
        Input input = new Input("kiopr");
        String expected = "hello";
        assertEquals(vigenereOverCaesar.decode(input), expected);
    }
    @Test
    public void testEncodeMultipleWords() {
        Input input = new Input("hello world");
        String expected = "kioprdzsupg";
        assertEquals(vigenereOverCaesar.encode(input), expected);
    }
    @Test
    public void testDecodeMultipleWords() {
        Input input = new Input("kioprdzsupg");

        String expected = "hello world";
        assertEquals(vigenereOverCaesar.decode(input), expected);
    }
}