import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Level2 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("./2-level/files/level2_5.in"))) {


            int N = Integer.parseInt(reader.readLine().trim());
            int[] prices = new int[N];


            for (int i = 0; i < N; i++) {
                prices[i] = Integer.parseInt(reader.readLine().trim());
            }
            int M = Integer.parseInt(reader.readLine().trim());
            int[] tasks = new int[M];
            System.out.println(M);
            for (int i = 0; i < M; i++) {
                String[] split = reader.readLine().split(" ");
                tasks[i] = Integer.parseInt(split[1].trim());
            }


            for (int i = 0; i < M; i++) {
                int lowest = Integer.MAX_VALUE;
                int id = -1;
                for (int j = 0; j <= N-tasks[i]; j++) {
                    int sum = 0;
                    for (int k = j; k < j+tasks[i]; k++) {
                        sum += prices[k];
                    }
                    if(sum < lowest){
                        lowest = sum;
                        id = j;
                    }
                }
                System.out.println(i+1 + " " + id);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
