package KUMDB.Actors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActorService {
    @Autowired
    private ActorJPA actorJPA;

    public void handlePost(Actor actor) {
        actorJPA.save(actor);
    }

    public List<Actor> getActors() {
        return actorJPA.findAll();
    }

    public Actor getActorById(String id) {
        return actorJPA.findById(id).get();
    }

    public void handlePut(String id, Actor actor) {
        Actor deleteActor = actorJPA.findById(id).get();
        actorJPA.delete(deleteActor);
        actorJPA.save(actor);
    }

    public void handleDelete(Actor actor) {
        actorJPA.delete(actor);
    }
}
