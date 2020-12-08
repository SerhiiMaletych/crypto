package pet_app.crypto.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pet_app.crypto.repository.HistoryRepository;
import pet_app.crypto.service.InputService;

import java.util.List;

@RestController
@RequestMapping("/history")
@PreAuthorize("hasAuthority('admin_rights')")
public class HistoryRestController {
    final InputService service;
    final HistoryRepository repository;

    public HistoryRestController(InputService service, HistoryRepository repository) {
        this.service = service;
        this.repository = repository;
    }


    @RequestMapping("/clear_history")
    public void clearHistory() {
    repository.clearHistory();
    

    }
    @GetMapping("/last_element")
    public List lastAddedElement() {
        return repository.lastElement();
    }




}
