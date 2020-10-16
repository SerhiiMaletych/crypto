package pet_app.crypto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MenuTemplateController {
    @RequestMapping(value = "/encodeMenu")
    public String encodeMenu() {
        return "menu/encodeMenu";
    }

    @RequestMapping(value = "/decodeMenu")
    public String decodeMenu() {
        return "menu/decodeMenu";
    }

    @RequestMapping(value = "/historyMenu")
    public String historyMenu() {
        return "menu/historyMenu";
    }
    @RequestMapping(value = "/analyticsMenu" )
    public String analyticsMenu() {
        return "menu/analyticsMenu";
    }



}
