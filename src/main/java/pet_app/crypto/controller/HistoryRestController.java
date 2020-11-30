package pet_app.crypto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pet_app.crypto.repository.InputRepository;
import pet_app.crypto.service.InputService;

import java.util.List;

@RestController
@RequestMapping("/history")
//@PreAuthorize("hasAuthority('admin_rights')")
public class HistoryRestController {
    final InputService service;
    final InputRepository repository;

    public HistoryRestController(InputService service, InputRepository repository) {
        this.service = service;
        this.repository = repository;
    }


    @GetMapping("/clear_history")
    public void clearHistory() {
        repository.clearHistory();
    }

    @GetMapping("/last_element")
    public List lastAddedElement() {
        return repository.lastElement();
    }


}
