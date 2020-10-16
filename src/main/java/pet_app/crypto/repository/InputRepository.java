package pet_app.crypto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pet_app.crypto.model.Input;

public interface InputRepository extends JpaRepository<Input, Long> {
}
