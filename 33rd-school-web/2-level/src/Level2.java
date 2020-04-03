import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Level2 {


    private static ArrayList<String> reached = new ArrayList<>();
    private static HashMap<String, Entity> entities = new HashMap<>();

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader("./2-level/files/level2_2.in"))) {
            int users = Integer.parseInt(reader.readLine());
            for (int i = 0; i < users; i++) {
                String user = reader.readLine();
                entities.put(user, new Entity(user));
            }
            int followsrev = Integer.parseInt(reader.readLine());
            for (int i = 0; i < followsrev; i++) {
                String follows = reader.readLine();
                String[] split = follows.split(" ");
                entities.get(split[0]).getFollower().add(split[1]);
            }
            int queryrev = Integer.parseInt(reader.readLine());
            for (int i = 0; i < queryrev; i++) {
                String query = reader.readLine();
                reached.clear();
                System.out.println(checkReach(entities.get(query),0));
            }
        }

    }

    private static int checkReach(Entity entity,int ret) {
        if(!reached.contains(entity.getName())){
            reached.add(entity.getName());
            ret++;
            for (String s : entity.getFollower()) {
                ret = checkReach(entities.get(s),ret);
            }
        }
        return ret;
    }

}


