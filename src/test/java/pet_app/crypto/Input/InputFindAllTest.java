package pet_app.crypto.Input;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import pet_app.crypto.model.Input;
import pet_app.crypto.repository.InputRepository;
import pet_app.crypto.service.InputService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(MockitoJUnitRunner.class)

public class InputFindAllTest {

    @InjectMocks
    InputService inputService;

    @Mock
    InputRepository inputRepository;

    @Test
    public void findAllInputs() {
        List<Input> inputs = new ArrayList();
        inputs.add(new Input());
        inputs.add(new Input());
        inputs.add(new Input());
        given(inputRepository.findAll()).willReturn(inputs);
        List<Input> expected = inputService.findAll();
        assertEquals(expected, inputs);
        verify(inputRepository).findAll();
    }
}
