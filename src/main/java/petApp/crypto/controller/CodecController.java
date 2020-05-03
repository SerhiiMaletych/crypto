package petApp.crypto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CodecController {
    @RequestMapping(value = "/caesar", method = RequestMethod.GET)
    public String CaesarController(){
        return "coders/caesar";
    }
    @RequestMapping(value = "/morse", method = RequestMethod.GET)
    public String MorseController(){
        return "coders/morse";
    }
    @RequestMapping(value = "/vigenere", method = RequestMethod.GET)
    public String VigenereController(){
        return "coders/vigenere";
    }
    @RequestMapping(value = "/vigenereOverCaesar", method = RequestMethod.GET)
    public String VigenereOverCaesarController(){
        return "coders/vigenereOverCaesar";
    }
}
