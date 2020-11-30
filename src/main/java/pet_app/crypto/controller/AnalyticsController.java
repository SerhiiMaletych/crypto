package pet_app.crypto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pet_app.crypto.repository.InputRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//@PreAuthorize("hasAuthority('admin_rights')")
@RequestMapping("analytics")
public class AnalyticsController {

    final InputRepository repository;


    public AnalyticsController(InputRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/most_used_codec")
    public String mostUsedCodec() {
        return  repository.findMostUsedCodec();
    }
    @GetMapping("/descending_inputs")
    public List descendingInputs() {
        return  repository.descendingInputs();
    }
    @GetMapping("/sort_to_date")
    public List sortToDate() {
        return repository.sortToDate();
    }




}
