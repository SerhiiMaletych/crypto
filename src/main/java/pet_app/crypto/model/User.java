package pet_app.crypto.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")


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

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User(Long id, @Size(min = 7, max = 40) String email, @Size(min = 6, max = 70) String password, @Size(min = 1, max = 20) String name, @Size(min = 1, max = 30) String surname, Role role, Status status) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.status = status;
    }
}