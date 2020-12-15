package pet_app.crypto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pet_app.crypto.model.Input;

import java.util.List;

@Repository
public interface InputRepository extends JpaRepository<Input, Long> {




}
