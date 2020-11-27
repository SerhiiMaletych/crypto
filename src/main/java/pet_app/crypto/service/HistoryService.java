package pet_app.crypto.service;


import org.springframework.stereotype.Service;
import pet_app.crypto.model.History;
import pet_app.crypto.repository.HistoryRepository;


import java.util.List;

@Service
public class HistoryService {

    final
    HistoryRepository repository;

    public HistoryService(HistoryRepository repository) {
        this.repository = repository;
    }


    public History findById(Long id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("Input not found"));
    }

    public List<History> findAll() {
        return repository.findAll();

    }

    public History saveInput(History history) {
        return repository.save(history);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
