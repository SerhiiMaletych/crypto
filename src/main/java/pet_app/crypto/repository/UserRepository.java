package pet_app.crypto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pet_app.crypto.model.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long> {
}
