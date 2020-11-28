package pet_app.crypto.model;


import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Builder
@Data
@Entity
@Table(name = "input")
public class Input {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String codec;
    private String input;
    private String translated;
    private Date date;

    public Input(String codec, String input, String translated, Date date) {
        this.codec = codec;
        this.input = input;
        this.translated = translated;
        this.date = date;
    }


    public Input() {

    }
    public Input(long id, String codec, String input, String translated, Date date) {
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

    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date =date;
    }


}
