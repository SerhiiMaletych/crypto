package pet_app.crypto.controller;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pet_app.crypto.controller.codec.CodecTemplateController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTestForNull {


    @Autowired
    CodecTemplateController codecController;
    @Autowired
    LoginController loginController;
    @Autowired
    MainController mainController;


    @Test
    public void CodecControllerNotNull() {
        assertThat(codecController).isNotNull();
    }

    @Test
    public void LoginControllerNotNull() {
        assertThat(loginController).isNotNull();
    }

    @Test
    public void main_controller_not_null() {
        assertThat(mainController).isNotNull();
    }


}