package pet_app.crypto.model;


import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Builder
@Data
@Entity

@Table(name = "input")
public class Input {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private Codec codec;
    private String input;
    private String translated;
    private String date;

    public Input(Codec codec, String input, String translated, Date date) {
        this.codec = codec;
        this.input = input;
        this.translated = translated;
        this.date = String.valueOf(date);
    }

    public Input(String input) {
        this.input=input;
    }
    public Input() {

    }
    public Input(long id, Codec codec, String input, String translated, String date) {
        this.id = id;
        this.codec = codec;
        this.input = input;
        this.translated = translated;
        this.date = date;
    }



    public String getInput() {
        return input;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Codec getCodec() {
        return codec;
    }

    public void setCodec(Codec codec) {
        this.codec = codec;
    }


    public void setInput(String input) {
        this.input = input;
    }


    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date =date;
    }


}
