package petApp.crypto.codec;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import petApp.crypto.coders.VigenereOverCaesar;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VigenereOverCaesarTest {
    @Autowired
    VigenereOverCaesar vigenereOverCaesar;
    @Test
    public void testEncode() {
        String expected = "kiopr";
        assertEquals(vigenereOverCaesar.encode("hello"), expected);
    }

    @Test
    public void testDecode() {
        String expected = "hello";
        assertEquals(vigenereOverCaesar.decode("kiopr"), expected);
    }
    @Test
    public void testEncodeMultipleWords() {
        String expected = "kioprdzsupg";
        assertEquals(vigenereOverCaesar.encode("hello world"), expected);
    }
    @Test
    public void testDecodeMultipleWords() {
        String expected = "hello world";
        assertEquals(vigenereOverCaesar.decode("kioprdzsupg"), expected);
    }
}