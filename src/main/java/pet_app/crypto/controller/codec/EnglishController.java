package pet_app.crypto.controller.codec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pet_app.crypto.coderService.GoogleTranslate;
import pet_app.crypto.model.Input;

import java.io.IOException;

@Controller
public class EnglishController {
    final
    GoogleTranslate codec;
    Input input = new Input();

    public EnglishController(GoogleTranslate codec) {
        this.codec = codec;
    }


    @RequestMapping("decode/googleTranslate")
    public String getEncodePage(Model model) {
        model.addAttribute("operation", input);
        return "coder/decode/googleTranslate";
    }

    @RequestMapping("encode/googleTranslate")
    public String getDecodePage(Model model) {
        model.addAttribute("operation", input);

        return "coder/encode/googleTranslate";
    }

    @PostMapping(value = "encode/googleTranslate", params = "encode")
    public String encode(@ModelAttribute("operation") Input input, Model model) throws IOException, InterruptedException {
        model.addAttribute("resultEncode", codec.encode(input));
        return "coder/encode/googleTranslate";
    }

    @PostMapping(value = "decode/googleTranslate", params = "decode")
    public String decode(@ModelAttribute("operation") Input input, Model model) throws IOException, InterruptedException {
        model.addAttribute("resultDecode", codec.decode(input));
        return "coder/decode/googleTranslate";
    }
}
