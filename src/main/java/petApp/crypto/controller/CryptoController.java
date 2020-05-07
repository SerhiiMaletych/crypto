package petApp.crypto.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CryptoController {
    @RequestMapping(value = "/caesarDecode")
    public String CaesarDecode() {
        return "/";
    }
}
