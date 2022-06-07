package KUMDB.Movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "movies")
public class MoviesController {

    @Autowired
    private MoviesService moviesService;

    @PostMapping
    public String postMovies(@RequestBody Movies movies){
        moviesService.handlePost(movies);
        return "success";
    }

    @GetMapping
    public List<Movies> getMovies(){ return moviesService.getMovies(); }

    @GetMapping("/id/{id}")
    public Movies getMovies(@PathVariable String id){
        return moviesService.getMoviesById(id);
    }

    @PutMapping("/id/{id}")
    public String putMovies(@PathVariable String id , @RequestBody Movies movies){
        moviesService.handlePut(id, movies);
        return "success";
    }

    @DeleteMapping
    public String deleteMovies(@RequestBody Movies movies){
        moviesService.handleDelete(movies);
        return "success";
    }
}