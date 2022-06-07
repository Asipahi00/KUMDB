package KUMDB.TVShows;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TVShowsService {
    @Autowired
    private TVShowsJPA tvShowsJPA;

    public void handlePost(TVShows tvshows) {
        tvShowsJPA.save(tvshows);
    }

    public List<TVShows> getTVShows() {
        return tvShowsJPA.findAll();
    }

    public TVShows getTVShowsById(String id) {
        return tvShowsJPA.findById(id).get();
    }

    public void handlePut(String id, TVShows tvshows) {
        TVShows deleteTVShows = tvShowsJPA.findById(id).get();
        tvShowsJPA.delete(deleteTVShows);
        tvShowsJPA.save(tvshows);
    }

    public void handleDelete(TVShows tvshows) {
        tvShowsJPA.delete(tvshows);
    }
}
