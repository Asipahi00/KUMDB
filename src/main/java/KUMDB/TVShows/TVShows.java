package KUMDB.TVShows;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tvshows")

public class TVShows {

    @Column
    @Id
    public String idtvshows;

    @Column
    public String name;

    @Column
    public String synopsis;

    @Column
    public String rating;

    @Column
    public String release_date;

    @Column
    public String is_adult;

    @Column
    public String lead;
}
