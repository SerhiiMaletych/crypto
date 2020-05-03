package petApp.crypto;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import petApp.crypto.coders.CaesarCodec;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class CaesarCodecTest {
    @Autowired
    CaesarCodec caesarCodec;

    @Test
    public void testEncodeOneWord() {
      String expected = "khoor";
        assertEquals(caesarCodec.encode("hello"), expected);
    }
    @Test
    public void testDecodeOneWord() {
        String expected = "hello";
        assertEquals(caesarCodec.decode("khoor"), expected);
    }
    @Test
    public void testEncodeMultipleWords(){
        String expected = "khoorczruog";
        assertEquals(caesarCodec.encode("hello world"), expected);

    }
    @Test
    public void testDecodeMultipleWords(){
        String expected = "hello world";
        assertEquals(caesarCodec.decode("khoorczruog"), expected);

    }


}