package pet_app.crypto.User;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import pet_app.crypto.model.Role;
import pet_app.crypto.model.Status;
import pet_app.crypto.model.User;
import pet_app.crypto.repository.UserRepository;
import pet_app.crypto.service.UserService;

import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(MockitoJUnitRunner.class)

public class UserDeleteTest {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

    @Test
    void deleteUser() {
        User user = new User();
        user.setId(1000L);
        user.setEmail("hello@gmail.com");
        user.setPassword("12345678");
        user.setStatus(Status.ACTIVE);
        user.setRole(Role.USER);
        user.setName("Vasya");
        user.setSurname("Pupkin");
        when(userRepository.findById(user.getId())).thenReturn(Optional.of(user));
        userService.deleteById(user.getId());
        verify(userRepository).deleteById(user.getId());
    }

}
