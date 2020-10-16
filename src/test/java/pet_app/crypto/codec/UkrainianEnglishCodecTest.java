//package pet_app.crypto.codec;
//
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//public class UkrainianEnglishCodecTest {
//    @Autowired
//    UkrainianEnglishCodec ukr;
//
//    @Test
//    public void testEncode() {
//        String expected = "будинок";
//        String expected1 = "будувати";
//        String expected2 = "високий";
//        assertEquals(ukr.encode("house"), expected);
//        assertEquals(ukr.encode("build"), expected1);
//        assertEquals(ukr.encode("high"), expected2);
//    }
//
//    @Test
//    public void testDecode() {
//        String expected = "house";
//        String expected1 = "build";
//        String expected2 = "high";
//        assertEquals(ukr.decode("будинок"), expected);
//        assertEquals(ukr.decode("будувати"), expected1);
//        assertEquals(ukr.decode("високий"), expected2);
//    }
//
//    @Test
//    public void testEncodeMultipleWords() {
//        String expected = "будувати високий будинок";
//        assertEquals(ukr.encode("build high house"), expected);
//    }
//
//    @Test
//    public void testDecodeMultipleWords() {
//        String expected = "build high house";
//        assertEquals(ukr.decode("будувати високий будинок"), expected);
//    }
//
//
//}
