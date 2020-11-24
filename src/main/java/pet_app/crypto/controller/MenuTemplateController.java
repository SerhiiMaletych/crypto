package pet_app.crypto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MenuTemplateController {
    @RequestMapping(value = "/encode")
    public String encodeMenu() {
        return "menu/encodeMenu";
    }

    @RequestMapping(value = "/decode")
    public String decodeMenu() {
        return "menu/decodeMenu";
    }

    @RequestMapping(value = "/history")
    public String historyMenu() {
        return "menu/historyMenu";
    }
    @RequestMapping(value = "/analytics" )
    public String analyticsMenu() {
        return "menu/analyticsMenu";
    }



}
