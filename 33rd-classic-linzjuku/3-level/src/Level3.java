import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Level3 {

    private final static double a = 6371000; // radius
    private final static double e = 0;  // eccentricity

    private final static double asq = Math.pow(a,2);
    private final static double esq = Math.pow(e,2);

    public static void main(String[] args) {
        double[] arr = new double[3];
        arr[0] = 49.828;
        arr[1] = 7.714;
        arr[2] = 11277.0;
        try(BufferedReader reader = new BufferedReader(new FileReader("Files/level3/level3_1.in"))) {
            String line;
            String elems[];
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                elems=line.split(",");
                arr[0] = Double.valueOf(elems[0]);
                arr[1] = Double.valueOf(elems[1]);
                arr[2] = Double.valueOf(elems[2]);
                double[] ret =lla2ecef(arr);
                System.out.println(ret[0]+" "+ret[1]+" "+ret[2]);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }



    }

    private static double[] lla2ecef(double[] lla){
        double lat = lla[0]/ 180* Math.PI;
        double lon = lla[1] / 180 * Math.PI;
        double alt = lla[2];

        double N = a / Math.sqrt(1 - esq * Math.pow(Math.sin(lat),2) );

        double x = (N+alt) * Math.cos(lat) * Math.cos(lon);
        double y = (N+alt) * Math.cos(lat) * Math.sin(lon);
        double z = ((1-esq) * N + alt) * Math.sin(lat);

        double[] ret = {x, y, z};
        return ret;
    }


}

