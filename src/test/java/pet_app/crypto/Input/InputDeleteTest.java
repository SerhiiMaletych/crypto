package pet_app.crypto.Input;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import pet_app.crypto.model.Codec;
import pet_app.crypto.model.Input;
import pet_app.crypto.repository.InputRepository;
import pet_app.crypto.service.InputService;

import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(MockitoJUnitRunner.class)

public class InputDeleteTest {

    @InjectMocks
    InputService inputService;

    @Mock
    InputRepository inputRepository;

    @Test
    void deleteInput() {
        Input input = new Input();
        input.setInput("hello");
        input.setCodec(Codec.CAESAR);
        input.setTranslated("world");
        input.setDate("14/02/2021");
        when(inputRepository.findById(input.getId())).thenReturn(Optional.of(input));
        inputService.deleteById(input.getId());
        verify(inputRepository).deleteById(input.getId());
    }

}
