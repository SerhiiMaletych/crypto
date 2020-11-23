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
    final CaesarCodec caesarCodec;
    Input input = new Input();

    public CaesarController(CaesarCodec caesarCodec) {


        this.caesarCodec = caesarCodec;
    }
    @RequestMapping("/caesar")
    public String getCalculatorPage(Model model) {
        model.addAttribute("operation", input);
        return "coder/caesar";
    }


    @PostMapping(value = "/caesar", params = "add")
    public String add(@ModelAttribute("operation") Input input, Model model) {
        model.addAttribute("result", caesarCodec.encode(input));
        return "coder/caesar";
    }

    @PostMapping(value = "/caesar", params = "decode")
    public String decode(@ModelAttribute("operation") Input input, Model model) {
        model.addAttribute("result", caesarCodec.decode(input));
        return "coder/caesar";
    }
}
