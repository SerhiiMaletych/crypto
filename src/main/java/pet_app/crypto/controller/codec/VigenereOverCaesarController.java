package pet_app.crypto.controller.codec;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pet_app.crypto.coderService.VigenereOverCaesar;
import pet_app.crypto.model.Input;
import pet_app.crypto.service.InputService;

@Controller
public class VigenereOverCaesarController {
    final InputService service;
    final VigenereOverCaesar codec;
    Input input = new Input();

    public VigenereOverCaesarController(VigenereOverCaesar codec, InputService service) {
        this.codec = codec;
        this.service = service;
    }


    @RequestMapping("/decode/vigenereOverCaesar")
    public String getDecodePage(Model model) {
        model.addAttribute("operation", input);
        return "coder/decode/vigenereOverCaesar";
    }

    @RequestMapping("/encode/vigenereOverCaesar")
    public String getEncodePage(Model model) {
        model.addAttribute("operation", input);
        return "coder/encode/vigenereOverCaesar";
    }


    @PostMapping(value = "/encode/vigenereOverCaesar", params = "encode")
    public String encode(@ModelAttribute("operation") Input input, Model model) {
        model.addAttribute("resultEncode", codec.encode(input));
        service.saveEncodeVigenereOverCaesar(input);
        return "coder/encode/vigenereOverCaesar";
    }

    @PostMapping(value = "/decode/vigenereOverCaesar", params = "decode")
    public String decode(@ModelAttribute("operation") Input input, Model model) {
        model.addAttribute("resultDecode", codec.decode(input));
        service.saveDecodeVigenereOverCaesar(input);
        return "coder/decode/vigenereOverCaesar";
    }
}
