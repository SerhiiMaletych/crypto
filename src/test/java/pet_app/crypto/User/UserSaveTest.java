package pet_app.crypto.User;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pet_app.crypto.model.Role;
import pet_app.crypto.model.Status;
import pet_app.crypto.model.User;
import pet_app.crypto.service.UserService;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class UserSaveTest {

    @Autowired
    UserService userService;


    @Test
   public void addUser() {
        User user = new User();
        user.setEmail("hello@gmail.com");
        user.setPassword("12345678");
        user.setStatus(Status.ACTIVE);
        user.setRole(Role.USER);
        user.setName("Vasya");
        user.setSurname("Pupkin");
        boolean isCreated = userService.saveUser(user);
        Assert.assertTrue(isCreated);
    }


    @Test
    public void updateUser() {
        User user = new User();
        user.setEmail("hello11@gmail.com");
        user.setPassword("12345678");
        user.setStatus(Status.ACTIVE);
        user.setRole(Role.USER);
        user.setName("Vasya");
        user.setSurname("Pupkin");
        userService.saveUser(user);
        user.setEmail("hello1@gmail.com");
        user.setPassword("112345678");
        user.setStatus(Status.ACTIVE);
        user.setRole(Role.USER);
        user.setName("Vasyan");
        user.setSurname("Pumpkin");
        userService.saveUser(user);
        Assert.assertEquals("hello1@gmail.com", user.getEmail());
        Assert.assertEquals(Status.ACTIVE, user.getStatus());
        Assert.assertEquals(Role.USER, user.getRole());
        Assert.assertEquals("Vasyan", user.getName());
        Assert.assertEquals("Pumpkin", user.getSurname());

    }


}
