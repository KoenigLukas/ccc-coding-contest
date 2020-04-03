import java.io.File;
import java.io.IOException;

public class TestMain {
     public static void main(String[] args) {
        Reader reader = new Reader(new File("Files\\input1"));
        int[][] input= null;

        try {
            input= reader.readMatrix();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
