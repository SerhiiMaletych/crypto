package pet_app.crypto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pet_app.crypto.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

}

