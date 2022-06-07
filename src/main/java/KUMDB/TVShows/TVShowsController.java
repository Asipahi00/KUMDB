package KUMDB.TVShows;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "tvshows")
public class TVShowsController {

    @Autowired
    private TVShowsService TVShowsService;

    @PostMapping
    public String postTVShows(@RequestBody TVShows tvshows){
        TVShowsService.handlePost(tvshows);
        return "success";
    }

    @GetMapping
    public List<TVShows> getTVShows(){ return TVShowsService.getTVShows(); }

    @GetMapping("/id/{id}")
    public TVShows getTVShows(@PathVariable String id){
        return TVShowsService.getTVShowsById(id);
    }

    @PutMapping("/id/{id}")
    public String putTVShows(@PathVariable String id , @RequestBody TVShows tvshows){
        TVShowsService.handlePut(id, tvshows);
        return "success";
    }

    @DeleteMapping
    public String deleteTVShows(@RequestBody TVShows tvshows){
        TVShowsService.handleDelete(tvshows);
        return "success";
    }
}