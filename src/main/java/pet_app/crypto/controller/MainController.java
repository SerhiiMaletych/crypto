package pet_app.crypto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

   @RequestMapping(value = "/")
    public String startPage() {
        return "startPage";
    }
}