package pet_app.crypto.model;


import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@Data
@Entity
@Table(name = "input")
public class Input {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String input;


    public Input(String input) {
        this.input = input;
    }


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
