import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Level3 {


    private static ArrayList<String> reached = new ArrayList<>();
    private static HashMap<String, Entity> entities = new HashMap<>();

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader("./3-level/files/level3_1.in"))) {
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
                String in1 = reader.readLine();
                String in2 = reader.readLine();

                String[] split1 = in1.split(" ");
                String[] split2 = in2.split(" ");
                reached.clear();
                int reach = 0;
                for (int j = 0; j < Integer.parseInt(split1[0]); j++) {
                    for (String s : split2) {
                        reached.add(s);
                    }
                    reach += checkReach(entities.get(split2[j]),0,Integer.parseInt(split1[1]),true);
                }
                //if(split2.length>1) reach+= split2.length;
                System.out.println(reach);
            }
        }

    }

    private static int checkReach(Entity entity,int ret, int days,boolean skip) {
        if(!reached.contains(entity.getName())|| skip ){
            if(!skip) reached.add(entity.getName());
            ret++;
            if(days > 0){
                for (String s : entity.getFollower()) {
                    ret = checkReach(entities.get(s),ret,(days-1),false);
                }
            }
        }
        return ret;
    }

}
