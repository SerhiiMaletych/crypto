package pet_app.crypto.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    public String clearHistory() {
        return repository.clearHistory("Now history is empty");

    }

    @GetMapping("/last_element")
    public List lastAddedElement() {
        return repository.lastElement();
    }


}
