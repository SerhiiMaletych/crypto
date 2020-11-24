package pet_app.crypto.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pet_app.crypto.model.Role;
import pet_app.crypto.model.Status;
import pet_app.crypto.model.User;
import pet_app.crypto.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }


    public User findById(Long id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("User not found"));
    }

    public List<User> findAll() {
        return repository.findAll();

    }

    public User saveUser(User users) {
        users.setPassword(passwordEncoder.encode(users.getPassword()));
        if(users.getRole()!= Role.ADMIN)
            users.setRole(Role.USER);


        users.setStatus(Status.ACTIVE);
        return repository.save(users);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
