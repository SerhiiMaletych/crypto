package pet_app.crypto.service;

import org.springframework.stereotype.Service;
import pet_app.crypto.coderService.*;
import pet_app.crypto.model.Input;
import pet_app.crypto.repository.InputRepository;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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


    Date date=java.util.Calendar.getInstance().getTime();

    public Input findById(Long id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("Input not found"));
    }

    public List<Input> findAll() {
        return repository.findAll();

    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Input saveInput(Input input) {
        input.setDate(date);
        return repository.save(input);
    }

    public Input saveEncodeCaesar(Input input) {
        input.setDate(date);
        input.setCodec("CAESAR");
        input.setTranslated(caesarCodec.encode(input));
        return repository.save(input);
    }

    public Input saveDecodeCaesar(Input input) {
        input.setDate(date);
        input.setCodec("CAESAR");
        input.setTranslated(caesarCodec.decode(input));
        return repository.save(input);
    }

    public Input saveEncodeMorse(Input input) {
        input.setDate(date);
        input.setCodec("MORSE");
        input.setTranslated(morseCodec.encode(input));
        return repository.save(input);
    }
    public Input saveDecodeMorse(Input input) {
        input.setDate(date);
        input.setCodec("MORSE");
        input.setTranslated(morseCodec.decode(input));
        return repository.save(input);
    }
    public Input saveEncodeGoogle(Input input) throws IOException, InterruptedException {
        input.setDate(date);
        input.setCodec("GOOGLE");
        input.setTranslated(googleTranslate.encode(input));
        return repository.save(input);
    }
    public Input saveDecodeGoogle(Input input) throws IOException, InterruptedException {
        input.setDate(date);
        input.setCodec("GOOGLE");
        input.setTranslated(googleTranslate.decode(input));
        return repository.save(input);
    }
    public Input saveEncodeVigenere(Input input) {
        input.setDate(date);
        input.setCodec("VIGENERE");
        input.setTranslated(vigenereCodec.encode(input));
        return repository.save(input);
    }
    public Input saveDecodeVigenere(Input input) {
        input.setDate(date);
        input.setCodec("Vigenere");
        input.setTranslated(vigenereCodec.decode(input));
        return repository.save(input);
    }
    public Input saveEncodeVigenereOverCaesar(Input input) {
        input.setDate(date);
        input.setCodec("VIGENEREOVERCAESAR");
        input.setTranslated(vigenereOverCaesar.encode(input));
        return repository.save(input);
    }
    public Input saveDecodeVigenereOverCaesar(Input input) {
        input.setDate(date);
        input.setCodec("VIGENEREOVERCAESAR");
        input.setTranslated(vigenereOverCaesar.decode(input));
        return repository.save(input);
    }


}
