package pet_app.crypto.controller.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pet_app.crypto.model.Input;
import pet_app.crypto.model.User;
import pet_app.crypto.service.UserService;

import java.util.List;

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

    @GetMapping("/users")
    public String findAllUsers(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "security/users";
    }

    @GetMapping("/user-delete/{id}")
    public String deleteRow(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return "redirect:/admin/users";


    }

}