package pet_app.crypto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pet_app.crypto.model.History;

public interface HistoryRepository extends JpaRepository<History, Long> {
}
