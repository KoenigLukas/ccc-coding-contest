import java.util.ArrayList;

public class Entity {

    String name;
    ArrayList<String> follower = new ArrayList<>();


    public Entity(String name) {
        this.name = name;
    }

    public Entity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getFollower() {
        return follower;
    }

    public void setFollower(ArrayList<String> follower) {
        this.follower = follower;
    }
}
