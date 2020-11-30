package pet_app.crypto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pet_app.crypto.model.Input;
import pet_app.crypto.model.User;

import java.util.List;

public interface InputRepository extends JpaRepository<Input, Long> {

    @Query(value= "SELECT codec FROM input GROUP BY codec ORDER BY count(*) DESC LIMIT 1", nativeQuery = true)
    String findMostUsedCodec ();

    @Query(value ="SELECT input FROM input ORDER BY  input DESC", nativeQuery = true)
    List descendingInputs();
    @Query(value = "SELECT * FROM input ORDER BY date ASC", nativeQuery = true)
    List sortToDate();
}
