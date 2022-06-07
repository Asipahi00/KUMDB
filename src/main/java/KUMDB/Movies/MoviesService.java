package KUMDB.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MoviesService {
    @Autowired
    private MoviesJPA moviesJPA;

    public void handlePost(Movies movies) {
        moviesJPA.save(movies);
    }

    public List<Movies> getMovies() {
        return moviesJPA.findAll();
    }

    public Movies getMoviesById(String id) {
        return moviesJPA.findById(id).get();
    }

    public void handlePut(String id, Movies movies) {
        Movies deleteMovies = moviesJPA.findById(id).get();
        moviesJPA.delete(deleteMovies);
        moviesJPA.save(movies);
    }

    public void handleDelete(Movies movies) {
        moviesJPA.delete(movies);
    }
}
