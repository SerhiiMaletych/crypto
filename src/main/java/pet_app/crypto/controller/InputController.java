package pet_app.crypto.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pet_app.crypto.model.Input;
import pet_app.crypto.service.InputService;

import java.util.List;

@Controller
@PreAuthorize("hasAuthority('admin_rights')")
public class InputController {
    final
    InputService service;

    public InputController(InputService service) {
        this.service = service;
    }

    @GetMapping("/history")
    public String findAll(Model model) {
        List<Input> history = service.findAll();
        model.addAttribute("history", history);
        return "history/history-page";

    }

    @GetMapping("/history-delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        service.deleteById(id);
        return "redirect:/history";
    }


    @GetMapping("/history-create")
    public String createForm(Input input) {
        return "history/history-create-page";

    }
    @PostMapping("/history-create")
    public String createHistoryElement(Input input) {
        service.saveInput(input);
        return "redirect:/history";
    }

}
