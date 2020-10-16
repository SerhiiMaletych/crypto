package pet_app.crypto.controller.codec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CodecTemplateController {


    @RequestMapping(value = "/morse")
    public String MorseController() {
        return "coders/morse";
    }

    @RequestMapping(value = "/vigenere")
    public String VigenereController() {
        return "coders/vigenere";
    }

    @RequestMapping(value = "/vigenereOverCaesar")
    public String VigenereOverCaesarController() {
        return "coders/vigenereOverCaesar";
    }

    @RequestMapping(value = "/ukrEng")
    public String UkrEngController() {
        return "coders/ukrEng";
    }

    @RequestMapping(value = "userInput")
    public String translationInput() {
        return "menu/userInput";

    }

}
