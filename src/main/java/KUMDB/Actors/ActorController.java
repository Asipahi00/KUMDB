package KUMDB.Actors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "actor")

public class ActorController {

    @Autowired
    private ActorService actorService;

    @PostMapping
    public String postActor(@RequestBody Actor actor){
        actorService.handlePost(actor);
        return "success";
    }

    @GetMapping
    public List<Actor> getActors(){ return actorService.getActors(); }

    @GetMapping("/id/{id}")
    public Actor getActors(@PathVariable String id){
        return actorService.getActorById(id);
    }

    @PutMapping("/id/{id}")
    public String putActor(@PathVariable String id , @RequestBody Actor actor){
        actorService.handlePut(id, actor);
        return "success";
    }

    @DeleteMapping
    public String deleteActor(@RequestBody Actor actor){
        actorService.handleDelete(actor);
        return "success";
    }
}
