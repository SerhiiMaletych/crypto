package pet_app.crypto.controller.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;


@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginPage() {
        return "security/login";
    }

    @PreAuthorize("hasAuthority('user_rights')")
    @GetMapping("/logout-page")
    public String successfulLoginPage(Principal principal, Model model) {
        model.addAttribute("username", principal.getName());
        return "security/logout";
    }

}
