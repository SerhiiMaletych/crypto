package pet_app.crypto.controller.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pet_app.crypto.model.User;
import pet_app.crypto.service.UserService;

@Controller
public class RegisterController {

    private final UserService service;

    public RegisterController(UserService service) {
        this.service = service;
    }

    @GetMapping("/registration")
    public String createForm(User users) {
        return "security/registration";

    }

    @PostMapping("/registration")
    public String createUser(User users) {
        service.saveUser(users);
        return "redirect:";
    }
}
