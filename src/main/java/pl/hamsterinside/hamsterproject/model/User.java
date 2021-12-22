package pl.hamsterinside.hamsterproject.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;



@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    private Long id;
    private String name;
    private String surname;
    private int age;


    public static boolean isValidUser(User user){
        return user != null
                && Strings.isNotBlank(user.name)
                && Strings.isNotBlank(user.surname);
    }
}
