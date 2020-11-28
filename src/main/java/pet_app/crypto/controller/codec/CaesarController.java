package pet_app.crypto.controller.codec;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pet_app.crypto.coderService.CaesarCodec;
import pet_app.crypto.coderService.ClearService;
import pet_app.crypto.model.Input;


@Controller
public class CaesarController {
    Input input = new Input();
    final CaesarCodec codec;


    public CaesarController(CaesarCodec codec) {

        this.codec = codec;


    }

    @RequestMapping("decode/caesar")
    public String getEncodePage(Model model) {
        model.addAttribute("operation", input);
        return "coder/decode/caesar";
    }

    @RequestMapping("encode/caesar")
    public String getDecodePage(Model model) {
        model.addAttribute("operation", input);
        return "coder/encode/caesar";
    }

    @PostMapping(value = "encode/caesar", params = "encode")
    public String encode(@ModelAttribute("operation") Input input, Model model) {
        model.addAttribute("resultEncode", codec.encode(input));
        return "coder/encode/caesar";
    }

    @PostMapping(value = "decode/caesar", params = "decode")
    public String decode(@ModelAttribute("operation") Input input, Model model) {
        model.addAttribute("resultDecode", codec.decode(input));
        return "coder/decode/caesar";
    }


}
