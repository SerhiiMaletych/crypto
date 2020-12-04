package pet_app.crypto.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pet_app.crypto.repository.AnalyticsRepository;


import java.util.List;

@RestController
@PreAuthorize("hasAuthority('admin_rights')")
@RequestMapping("analytics")
public class AnalyticsController {

    final AnalyticsRepository repository;


    public AnalyticsController(AnalyticsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/most_used_codec")
    public String mostUsedCodec(){

        return repository.findMostUsedCodec();

    }
    @GetMapping("/descending_inputs")
    public List descendingInputs(Model model) {
        model.addAttribute("descendingInputs", repository.descendingInputs());
        return  repository.descendingInputs();
    }
    @GetMapping("/sort_to_date")
    public List sortToDate(Model model) {
        model.addAttribute("sortToDate", repository.sortToDate());
        return repository.sortToDate();
    }




}
