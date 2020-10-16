package pet_app.crypto.controller.codec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/caesar")
public class CaesarController {

    @PostMapping(value = "/caesar/encode")
    public String caesarEncode() {
        return "coder/caesar";
    }
}
