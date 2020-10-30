import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Level1 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("./1-level/files/level1_5.in"))) {
            String line;
            int pos = 0;
            int low = Integer.MAX_VALUE;
            reader.readLine();
            while((line = reader.readLine())!=null){

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
