package pet_app.crypto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pet_app.crypto.model.History;
import pet_app.crypto.service.HistoryService;

import java.util.List;


@Controller
//@PreAuthorize("hasAuthority('admin_rights')")
public class HistoryController {
        final
        HistoryService service;

    public HistoryController(HistoryService service) {
        this.service = service;
    }

    @GetMapping("/history")
    public String findAll(Model model) {
        List<History> history = service.findAll();
        model.addAttribute("history", history);
        return "history/history-page";

    }
}
