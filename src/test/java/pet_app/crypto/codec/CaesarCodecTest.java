package pet_app.crypto.codec;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pet_app.crypto.coderService.CaesarCodec;
import pet_app.crypto.model.Input;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class CaesarCodecTest {
    @Autowired
    CaesarCodec caesarCodec;

    @Test
    public void testEncodeOneWord() {

        Input input = new Input("hello");
        String expected = "khoor";
        assertEquals(caesarCodec.encode(input), expected);
    }
    @Test
    public void testDecodeOneWord() {
        Input input = new Input("khoor");
        String expected = "hello";
        assertEquals(caesarCodec.decode(input), expected);
    }
    @Test
    public void testEncodeMultipleWords(){
        Input input = new Input("hello world");
        String expected = "khoorczruog";
        assertEquals(caesarCodec.encode(input), expected);

    }
    @Test
    public void testDecodeMultipleWords(){
        Input input = new Input("khoorczruog");
        String expected = "hello world";
        assertEquals(caesarCodec.decode(input), expected);

    }


}