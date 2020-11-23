package pet_app.crypto.controller.codec;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pet_app.crypto.coderService.VigenereCodec;
import pet_app.crypto.model.Input;

@Controller
public class VigenereController {
    final
    VigenereCodec codec;
    Input input = new Input();

    public VigenereController(VigenereCodec codec) {
        this.codec = codec;
    }

    @RequestMapping("/decode/vigenere")
    public String getDecodePage(Model model) {
        model.addAttribute("operation", input);
        return "coder/decode/vigenere";
    }
    @RequestMapping("/encode/vigenere")
    public String getEncodePage(Model model) {
        model.addAttribute("operation", input);
        return "coder/encode/vigenere";
    }


    @PostMapping(value = "/encode/vigenere", params = "encode")
    public String encode(@ModelAttribute("operation") Input input, Model model) {
        model.addAttribute("resultEncode", codec.encode(input));
        return "coder/encode/vigenere";
    }

    @PostMapping(value = "/decode/vigenere", params = "decode")
    public String decode(@ModelAttribute("operation") Input input, Model model) {
        model.addAttribute("resultDecode", codec.decode(input));
        return "coder/decode/vigenere";
    }
}
