package pet_app.crypto.controller.codec;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pet_app.crypto.coderService.CaesarCodec;
import pet_app.crypto.model.Input;

@Controller
public class CaesarController {
    final CaesarCodec codec;
    Input input = new Input();

    public CaesarController(CaesarCodec codec) {


        this.codec = codec;
    }
    @RequestMapping("/caesar")
    public String getPage(Model model) {
        model.addAttribute("operation", input);
        return "coder/caesar";
    }


    @PostMapping(value = "/caesar", params = "encode")
    public String encode(@ModelAttribute("operation") Input input, Model model) {
        model.addAttribute("resultEncode", codec.encode(input));
        return "coder/caesar";
    }

    @PostMapping(value = "/caesar", params = "decode")
    public String decode(@ModelAttribute("operation") Input input, Model model) {
        model.addAttribute("resultDecode", codec.decode(input));
        return "coder/caesar";
    }
}
