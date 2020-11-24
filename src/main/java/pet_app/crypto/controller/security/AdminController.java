package pet_app.crypto.controller.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pet_app.crypto.service.UserService;

@Controller
@PreAuthorize("hasAuthority('admin_rights')")
@RequestMapping("admin")
public class AdminController {
    private final UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;

    }

    @RequestMapping("admin-page")
    public String admin() {
        return "security/admin-page";
    }
}