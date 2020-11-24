package pet_app.crypto.controller;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTestForNull {


    @Autowired
    LoginController loginController;
    @Autowired
    MainController mainController;




    @Test
    public void LoginControllerNotNull() {
        assertThat(loginController).isNotNull();
    }

    @Test
    public void main_controller_not_null() {
        assertThat(mainController).isNotNull();
    }


}