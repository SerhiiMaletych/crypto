package pet_app.crypto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pet_app.crypto.coderService.ClearService;
import pet_app.crypto.model.Input;


@Controller
public class MainController {

    final
    ClearService service;

    public MainController(ClearService service) {
        this.service = service;
    }

    @RequestMapping(value = "/")
    public String startPage() {
        return "startPage";
    }

    @PostMapping(value = "/", params = "clear")
    public void clear(@ModelAttribute("operation") Input input, Model model) {
        model.addAttribute("operation", service.clearResult(input));
        model.addAttribute("result", 0);

}
    }
