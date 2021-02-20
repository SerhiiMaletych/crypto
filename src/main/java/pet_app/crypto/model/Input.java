package pet_app.crypto.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
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
        this.input = input;
    }




}
