package petApp.crypto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MenuTemplateController {
    @RequestMapping(value = "/encodeMenu")
    public String encodeMenu() {
        return "menu/encodeMenu";
    }

    @RequestMapping(value = "/decodeMenu", method = RequestMethod.GET)
    public String decodeMenu() {
        return "menu/decodeMenu";
    }

    @RequestMapping(value = "/historyMenu", method = RequestMethod.GET)
    public String historyMenu() {
        return "menu/historyMenu";
    }
    @RequestMapping(value = "/analyticsMenu", method = RequestMethod.GET)
    public String analyticsMenu() {
        return "menu/analyticsMenu";
    }

}
