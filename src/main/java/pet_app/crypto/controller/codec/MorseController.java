package pet_app.crypto.controller.codec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pet_app.crypto.coderService.MorseCodec;
import pet_app.crypto.model.Input;

@Controller
public class MorseController {

        final MorseCodec codec;
    Input input = new Input();

    public MorseController(MorseCodec codec) {
        this.codec = codec;
    }


    @RequestMapping("decode/morse")
    public String getEncodePage(Model model) {
        model.addAttribute("operation", input);
        return "coder/decode/morse";
    }
    @RequestMapping("encode/morse")
    public String getDecodePage(Model model) {
        model.addAttribute("operation", input);

        return "coder/encode/morse";
    }

    @PostMapping(value = "encode/morse", params = "encode")
    public String encode(@ModelAttribute("operation") Input input, Model model) {
        model.addAttribute("resultEncode", codec.encode(input));
        return "coder/encode/morse";
    }

    @PostMapping(value = "decode/morse", params = "decode")
    public String decode(@ModelAttribute("operation") Input input, Model model) {
        model.addAttribute("resultDecode", codec.decode(input));
        return "coder/decode/morse";
    }
}
