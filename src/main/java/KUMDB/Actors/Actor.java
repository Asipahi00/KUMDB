package KUMDB.Actors;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "actor")

public class Actor {

    @Column
    @Id
    public String idactors;

    @Column
    public String name;

    @Column
    public String surname;

    @Column
    public String age;

    @Column
    public String birth_year;
}
