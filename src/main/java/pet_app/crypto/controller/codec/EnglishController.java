//package pet_app.crypto.controller.codec;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import pet_app.crypto.coderService.GoogleTranslate;
//import pet_app.crypto.model.Input;
//import pet_app.crypto.service.InputService;
//
//import java.io.IOException;
//
//@Controller
//public class EnglishController {
//
//    final InputService service;
//    final GoogleTranslate codec;
//    Input input = new Input();
//
//    public EnglishController(GoogleTranslate codec, InputService service) {
//        this.codec = codec;
//        this.service = service;
//    }
//
//
//    @RequestMapping("decode/googleTranslate")
//    public String getEncodePage(Model model) {
//        model.addAttribute("operation", input);
//        return "coder/decode/googleTranslate";
//    }
//
//    @RequestMapping("encode/googleTranslate")
//    public String getDecodePage(Model model) {
//        model.addAttribute("operation", input);
//
//        return "coder/encode/googleTranslate";
//    }
//
//    @PostMapping(value = "encode/googleTranslate", params = "encode")
//    public String encode(@ModelAttribute("operation") Input input, Model model) throws IOException, InterruptedException {
//        model.addAttribute("resultEncode", codec.encode(input));
//        service.saveEncodeGoogle(input);
//        return "coder/encode/googleTranslate";
//    }
//
//    @PostMapping(value = "decode/googleTranslate", params = "decode")
//    public String decode(@ModelAttribute("operation") Input input, Model model) throws IOException, InterruptedException {
//        model.addAttribute("resultDecode", codec.decode(input));
//        service.saveDecodeGoogle(input);
//        return "coder/decode/googleTranslate";
//    }
//}
