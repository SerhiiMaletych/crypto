package pet_app.crypto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pet_app.crypto.model.Input;

import java.util.List;

@Repository
public interface AnalyticsRepository extends JpaRepository<Input, Long> {
    @Query(value= "SELECT codec FROM input GROUP BY codec ORDER BY count(*) DESC LIMIT 1", nativeQuery = true)
    List<Input> findMostUsedCodec ();
    @Query(value ="SELECT input FROM input ORDER BY  input DESC", nativeQuery = true)
    List<Input> descendingInputs();
    @Query(value = "SELECT * FROM input ORDER BY date DESC", nativeQuery = true)
    List<Input> sortToDate();
    @Query(value ="select distinct count (codec), codec from input group by codec", nativeQuery = true )
    List<Input> countCodec();
}
