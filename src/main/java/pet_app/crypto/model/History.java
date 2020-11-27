package pet_app.crypto.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class History {

    @Id
    private long id;
    private String codec;
    private String input;
    private String translated;
    private String date;

    public History() {

    }

    public History(long id, String codec, String input, String translated, String date) {
        this.id = id;
        this.codec = codec;
        this.input = input;
        this.translated = translated;
        this.date = date;
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

    public String getInput() {
        return input;
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
        this.date = date;
    }


}
