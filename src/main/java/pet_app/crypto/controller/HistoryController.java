package pet_app.crypto.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pet_app.crypto.model.Input;
import pet_app.crypto.service.InputService;

import java.util.List;

@Controller
@PreAuthorize("hasAuthority('admin_rights')")
class HistoryController {
    final InputService service;

    public HistoryController(InputService service) {
        this.service = service;
    }

    @GetMapping("/history/show_all")
    public String findAll(Model model) {
        List<Input> history = service.findAll();
        model.addAttribute("history", history);
        return "history/history_page";
    }
        @GetMapping("/history-delete/{id}")
        public String deleteRow(@PathVariable("id") Long id) {
            service.deleteById(id);
            return "redirect:/history/show_all";


    }

    }