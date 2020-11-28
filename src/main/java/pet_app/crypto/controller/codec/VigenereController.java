package pet_app.crypto.controller.codec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pet_app.crypto.coderService.VigenereCodec;
import pet_app.crypto.model.Input;
import pet_app.crypto.service.InputService;

@Controller
public class VigenereController {
   final InputService service;
    final VigenereCodec codec;
    Input input = new Input();

    public VigenereController(VigenereCodec codec, InputService service) {
        this.codec = codec;
        this.service = service;
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
        service.saveEncodeVigenere(input);
        return "coder/encode/vigenere";
    }

    @PostMapping(value = "/decode/vigenere", params = "decode")
    public String decode(@ModelAttribute("operation") Input input, Model model) {
        model.addAttribute("resultDecode", codec.decode(input));
        service.saveDecodeVigenere(input);
        return "coder/decode/vigenere";
    }
}
