package pet_app.crypto.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pet_app.crypto.repository.AnalyticsRepository;

import java.util.List;

@Controller
@PreAuthorize("hasAuthority('admin_rights')")
@RequestMapping("analytics")
public class AnalyticsController {

    final AnalyticsRepository repository;


    public AnalyticsController(AnalyticsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/most_used_codec")
    public String mostUsedCodec(){
         repository.findMostUsedCodec();
         return "analytics/most-used-codec";

    }
    @GetMapping("/descending_inputs")
    public String descendingInputs() {
          repository.descendingInputs();
          return "analytics/descending-inputs";
    }
    @GetMapping("/sort_to_date")
    public String sortToDate() {
         repository.sortToDate();
         return "analytics/sort-to-date";
    }

    @GetMapping("/count_codec")
    public String countCodec() {
         repository.countCodec();
         return "analytics/count-codec";
    }




}
