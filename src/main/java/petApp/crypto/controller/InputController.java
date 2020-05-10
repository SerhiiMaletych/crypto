package petApp.crypto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import petApp.crypto.model.UserInput;

@Controller
public class InputController {
    @GetMapping("/userInput")
    public String userInput(Model model) {
        model.addAttribute("userInput", new UserInput());
        return "menu/userInput";

        }

}
