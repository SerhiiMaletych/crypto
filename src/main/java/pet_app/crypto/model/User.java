package pet_app.crypto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "email", nullable = false, unique = true)
    @Size(min = 7, max = 40)
    private String email;
    @Size(min = 6, max = 70)
    @Column(name = "password")
    private String password;
    @Size(min = 1, max = 20)
    @Column(name = "first_name", nullable = false)
    private String name;
    @Size(min = 1, max = 30)
    @Column(name = "last_name", nullable = false)
    private String surname;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    private Role role;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private Status status;




}