package pet_app.crypto.controller;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pet_app.crypto.coderService.VigenereOverCaesar;
import pet_app.crypto.controller.codec.CaesarController;
import pet_app.crypto.controller.codec.MorseController;
import pet_app.crypto.controller.codec.VigenereController;
import pet_app.crypto.controller.security.AdminController;
import pet_app.crypto.controller.security.AuthController;
import pet_app.crypto.controller.security.RegisterController;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTestForNull {


    @Autowired
    AdminController adminController;
    @Autowired
    MainController mainController;
    @Autowired
    HistoryController historyController;
    @Autowired
    AnalyticsController analyticsController;
    @Autowired
    RegisterController registerController;
    @Autowired
    MenuTemplateController menuTemplateController;
    @Autowired
    AuthController authController;
    @Autowired
    CaesarController caesarController;
    @Autowired
    MorseController morseController;
    @Autowired
    VigenereController vigenereController;
    @Autowired
    VigenereOverCaesar vigenereOverCaesar;


    @Test
    public void admin_controller_not_null() {
        assertThat(adminController).isNotNull();
    }
    @Test
    public void main_controller_not_null() {
        assertThat(mainController).isNotNull();
    }
    @Test
    public void history_controller_not_null() {
        assertThat(historyController).isNotNull();
    }
    @Test
    public void analytics_controller_not_null() {
        assertThat(analyticsController).isNotNull();
    }
    @Test
    public void register_controller_not_null() {
        assertThat(registerController).isNotNull();
    }
    @Test
    public void menu_controller_not_null() {
        assertThat(menuTemplateController).isNotNull();
    }
    @Test
    public void auth_controller_not_null() {
        assertThat(authController).isNotNull();
    }
    @Test
    public void caesar_controller_not_null() {
        assertThat(caesarController).isNotNull();
    }
    @Test
    public void morse_controller_not_null() {
        assertThat(morseController).isNotNull();
    }
    @Test
    public void vigegere_controller_not_null() {
        assertThat(vigenereController).isNotNull();
    }
    @Test
    public void vigenere_over_ceasar_controller_not_null() {
        assertThat(vigenereOverCaesar).isNotNull();
    }


}