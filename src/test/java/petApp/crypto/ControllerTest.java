package petApp.crypto;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import petApp.crypto.controller.CodecController;
import petApp.crypto.controller.LoginController;
import petApp.crypto.controller.MainController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ControllerTest {
    @Autowired
    CodecController codecController;
    @Autowired
    LoginController loginController;
    @Autowired
    MainController mainController;
    @Test
    public void CodecControllerNotNull()  {
        assertThat(codecController).isNotNull();
    }
    @Test
    public void LoginControllerNotNull()  {
        assertThat(loginController).isNotNull();
    }
    @Test
    public void main_controller_not_null()  {
        assertThat(mainController).isNotNull();
    }
}