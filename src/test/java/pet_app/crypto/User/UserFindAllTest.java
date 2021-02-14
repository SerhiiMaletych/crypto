package pet_app.crypto.User;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import pet_app.crypto.model.User;
import pet_app.crypto.repository.UserRepository;
import pet_app.crypto.service.UserService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(MockitoJUnitRunner.class)

public class UserFindAllTest {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

    @Test
    void findAllUsers() {
        List<User> users = new ArrayList();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        given(userRepository.findAll()).willReturn(users);
        List<User> expected = userService.findAll();
        assertEquals(expected, users);
        verify(userRepository).findAll();
    }
}
