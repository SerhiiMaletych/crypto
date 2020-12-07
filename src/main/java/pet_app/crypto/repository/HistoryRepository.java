package pet_app.crypto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pet_app.crypto.model.Input;

import java.util.List;

public interface HistoryRepository extends JpaRepository<Input, Long> {
    @Query(value = "TRUNCATE TABLE input", nativeQuery = true)
    String clearHistory() ;
    @Query(value = "SELECT * FROM input ORDER BY id desc limit 1", nativeQuery = true)
    List lastElement() ;

}
