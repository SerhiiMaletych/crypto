package pet_app.crypto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pet_app.crypto.model.Input;

import java.util.List;

@Repository
public interface HistoryRepository extends JpaRepository<Input, Long> {
    @Query(value = "TRUNCATE TABLE input", nativeQuery = true)
    void clearHistory() ;
    @Query(value = "SELECT * FROM input ORDER BY id desc limit 1", nativeQuery = true)
    List<Input> lastElement() ;

}
