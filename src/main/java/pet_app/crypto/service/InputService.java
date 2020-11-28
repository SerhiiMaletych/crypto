package pet_app.crypto.service;

import org.springframework.stereotype.Service;
import pet_app.crypto.model.Input;
import pet_app.crypto.repository.InputRepository;


import java.time.LocalDate;
import java.util.List;

@Service
public class InputService {

    final
    InputRepository repository;

    public InputService(InputRepository repository) {
        this.repository = repository;
    }

    LocalDate date = LocalDate.now();

    public Input findById(Long id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("Input not found"));
    }

    public List<Input> findAll() {
        return repository.findAll();

    }

    public Input saveInput(Input input) {
        input.setDate(date);
        return repository.save(input);
    }




    public void deleteById(Long id) {
        repository.deleteById(id);
    }


}
