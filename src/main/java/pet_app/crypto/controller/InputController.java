package pet_app.crypto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pet_app.crypto.model.Input;

@Controller
public class InputController {
    @GetMapping("/userInput")
    public String userInput(Model model) {
        model.addAttribute("userInput", new Input());
        return "menu/userInput";

        }

    @PostMapping("/userInput")
    public String inputSubmit(@ModelAttribute Input userInput) {
        return "menu/result";
    }

}
