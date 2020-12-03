package pet_app.crypto.service;

import org.springframework.stereotype.Service;
import pet_app.crypto.coderService.*;
import pet_app.crypto.model.Input;
import pet_app.crypto.repository.InputRepository;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class InputService {
    final CaesarCodec caesarCodec;
    final MorseCodec morseCodec;
    final VigenereCodec vigenereCodec;
    final VigenereOverCaesar vigenereOverCaesar;
    final GoogleTranslate googleTranslate;
    final InputRepository repository;

    public InputService(InputRepository repository, CaesarCodec caesarCodec, MorseCodec morseCodec, VigenereCodec vigenereCodec, VigenereOverCaesar vigenereOverCaesar, GoogleTranslate googleTranslate) {
        this.repository = repository;
        this.caesarCodec = caesarCodec;
        this.morseCodec = morseCodec;
        this.vigenereCodec = vigenereCodec;
        this.vigenereOverCaesar = vigenereOverCaesar;
        this.googleTranslate = googleTranslate;
    }




    public Input findById(Long id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("Input not found"));
    }

    public List<Input> findAll() {
        return repository.findAll();

    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }


    public void saveEncodeCaesar(Input input) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        input.setDate(dateTime.format(formatter));
        input.setCodec("CAESAR");
        input.setTranslated(caesarCodec.encode(input));
        repository.save(input);
    }

    public void saveDecodeCaesar(Input input) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        input.setDate(dateTime.format(formatter));
        input.setCodec("CAESAR");
        input.setTranslated(caesarCodec.decode(input));
        repository.save(input);
    }

    public void saveEncodeMorse(Input input) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        input.setDate(dateTime.format(formatter));
        input.setCodec("MORSE");
        input.setTranslated(morseCodec.encode(input));
        repository.save(input);
    }

    public void saveDecodeMorse(Input input) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        input.setDate(dateTime.format(formatter));
        input.setCodec("MORSE");
        input.setTranslated(morseCodec.decode(input));
        repository.save(input);
    }

    public void saveEncodeGoogle(Input input) throws IOException, InterruptedException {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        input.setDate(dateTime.format(formatter));
        input.setCodec("GOOGLE");
        input.setTranslated(googleTranslate.encode(input));
        repository.save(input);
    }

    public void saveDecodeGoogle(Input input) throws IOException, InterruptedException {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        input.setDate(dateTime.format(formatter));
        input.setCodec("GOOGLE");
        input.setTranslated(googleTranslate.decode(input));
        repository.save(input);
    }

    public void saveEncodeVigenere(Input input) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        input.setDate(dateTime.format(formatter));
        input.setCodec("VIGENERE");
        input.setTranslated(vigenereCodec.encode(input));
        repository.save(input);
    }

    public void saveDecodeVigenere(Input input) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        input.setDate(dateTime.format(formatter));
        input.setCodec("Vigenere");
        input.setTranslated(vigenereCodec.decode(input));
        repository.save(input);
    }

    public void saveEncodeVigenereOverCaesar(Input input) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        input.setDate(dateTime.format(formatter));
        ;
        input.setCodec("VIGENEREOVERCAESAR");
        input.setTranslated(vigenereOverCaesar.encode(input));
        repository.save(input);
    }

    public void saveDecodeVigenereOverCaesar(Input input) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        input.setDate(dateTime.format(formatter));
        input.setCodec("VIGENEREOVERCAESAR");
        input.setTranslated(vigenereOverCaesar.decode(input));
        repository.save(input);
    }


}
