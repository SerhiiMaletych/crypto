package pet_app.crypto.controller.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginPage() {
        return "security/login";
    }

    @GetMapping("/user-info")
    public String successfulLoginPage() {
        return "security/user-info";
    }
}
