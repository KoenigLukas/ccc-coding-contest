import java.io.*;

public class Level4 {

    public static void main(String[] args) {
        String path = "./4-level/file/level4_example";
        try (BufferedReader reader = new BufferedReader(new FileReader(path+".in"));
             PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(path+".out")))) {


            int N = Integer.parseInt(reader.readLine().trim());
            int[] prices = new int[N];

            for (int i = 0; i < N; i++) {
                prices[i] = Integer.parseInt(reader.readLine().trim());
            }

            int M = Integer.parseInt(reader.readLine().trim());
            int[][] tasks = new int[M][3];

            writer.println(M);
            System.out.println(M);

            for (int i = 0; i < M; i++) {
                String[] split = reader.readLine().split(" ");
                tasks[i][0] = Integer.parseInt(split[1]);
                tasks[i][1] = Integer.parseInt(split[2]);
                tasks[i][2] = Integer.parseInt(split[3]);
            }

            for (int i = 0; i < M; i++) {
                int lowest = Integer.MAX_VALUE;
                int id = -1;
                for (int j = tasks[i][1]; j <= tasks[i][2]; j++) {
                    if(prices[j] < lowest){
                        lowest = prices[j];
                        id = j;
                    }
                }
                writer.println(i+1 + " " + id + " "+ tasks[i][0]);
                System.out.println(i+1 + " " + id + " "+ tasks[i][0]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
