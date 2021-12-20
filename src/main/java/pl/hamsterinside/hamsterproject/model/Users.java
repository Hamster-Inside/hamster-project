package pl.hamsterinside.hamsterproject.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;


import java.util.List;
@Getter
@Setter
@Component
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    private Long id;
    private String name;
    private String surname;
    private int age;
    private List<String> languages;
}
