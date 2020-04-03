import java.io.*;
import java.util.HashMap;

public class Level1 {
    public static void main(String[] args) throws IOException {

        HashMap<String,Entity> ret = new HashMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("./1-level/files/level1_5.in"))){
            int users = Integer.parseInt(reader.readLine());
            for (int i = 0; i < users; i++) {
                String user = reader.readLine();
                ret.put(user,new Entity(user));
            }
            int followsrev = Integer.parseInt(reader.readLine());
            for (int i = 0; i < followsrev; i++) {
                String follows = reader.readLine();
                String[] split = follows.split(" ");
                ret.get(split[0]).getFollower().add(split[1]);
            }
            int queryrev = Integer.parseInt(reader.readLine());
            for (int i = 0; i < queryrev; i++) {
                String query = reader.readLine();
                System.out.println(ret.get(query).getFollower().size());
            }
        }

    }


}
