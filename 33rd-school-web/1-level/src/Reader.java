import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    File file;

    public Reader(File file) {
        this.file = file;
    }

    public int[][] readMatrix() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            List<int[]> rows = new ArrayList<int[]>();
            for (String s = br.readLine(); s != null; s = br.readLine()) {
                String items[] = s.split(" ");
                int[] row = new int[items.length];
                for (int i = 0; i < items.length; ++i) {
                    row[i] = Integer.parseInt(items[i]);
                }
                rows.add(row);
            }
        return rows.toArray(new int[rows.size()][]);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

}
