package pet_app.crypto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pet_app.crypto.model.Role;
import pet_app.crypto.model.Status;
import pet_app.crypto.model.User;
import pet_app.crypto.service.UserService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootApplication
public class CryptoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptoApplication.class, args);
	}


	@Bean
	CommandLineRunner runner(UserService userService) throws IOException {

		return args -> {
			userService.saveUser(new User(999999L, "user@gmail.com", "user", "user", "userov", Role.USER, Status.ACTIVE));
			userService.saveUser(new User(1000001L, "admin@gmail.com", "admin", "admin", "adminov", Role.ADMIN, Status.ACTIVE));


		};
	}
}
