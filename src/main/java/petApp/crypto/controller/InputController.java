package petApp.crypto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import petApp.crypto.model.UserInput;

@Controller
public class InputController {
    @GetMapping("/userInput")
    public String userInput(Model model) {
        model.addAttribute("userInput", new UserInput());
        return "menu/userInput";

        }

    @PostMapping("/userInput")
    public String inputSubmit(@ModelAttribute UserInput userInput) {
        return "menu/result";
    }

}
