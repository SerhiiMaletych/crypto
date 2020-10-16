package pet_app.crypto.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Input {

    @Id
    private long id;
    private String input;

    public Input(long id, String input) {
        this.id = id;
        this.input = input;
    }
    public Input() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }


}
