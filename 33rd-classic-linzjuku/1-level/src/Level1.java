import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Level1 {

    private static LinkedList<Cord> list = new LinkedList<>();

    public static void main(String[] args) throws FileNotFoundException {
        String path = "./1-level/files/level1_3.in";
        try(Scanner sc = new Scanner(new BufferedReader(new FileReader(path)))){
            int iterations = sc.nextInt();
            for (int i = 0; i < iterations; i++) {
                String input = sc.next();

                String[] split = input.split(",");

                list.add(new Cord(Integer.parseInt(split[0]),Float.parseFloat(split[1]),Float.parseFloat(split[2]),Float.parseFloat(split[3])));
            }

            System.out.println(findMinTime() +" " + findMaxTime());
            System.out.println(findMinLat() + " " + findMaxLat());
            System.out.println(findMinLog() + " " + findMaxLog());
            System.out.println(findMaxAlt());

        }


    }

    private static int findMaxTime(){
        int max = 0;
        for (Cord cord : list) {
            if(cord.getTimestamp() > max) max = cord.getTimestamp();
        }
        return max;
    }

    private static int findMinTime(){
        int min = findMaxTime();
        for (Cord cord : list) {
            if(cord.getTimestamp() < min) min = cord.getTimestamp();
        }
        return min;
    }

    private static float findMaxLat(){
        float max = 0;
        for (Cord cord : list) {
            if(cord.getLat() > max) max = cord.getLat();
        }
        return max;
    }

    private static float findMinLat(){
        float min = findMaxLat();
        for (Cord cord : list) {
            if(cord.getLat() < min) min = cord.getLat();
        }
        return min;
    }

    private static float findMaxLog(){
        float max = 0;
        for (Cord cord : list) {
            if(cord.getLog() > max) max = cord.getLog();
        }
        return max;
    }

    private static float findMinLog(){
        float min = findMaxLog();
        for (Cord cord : list) {
            if(cord.getLog() < min) min = cord.getLog();
        }
        return min;
    }

    private static float findMaxAlt(){
        float max = 0;
        for (Cord cord : list) {
            if(cord.getAlt() > max) max = cord.getAlt();
        }
        return max;
    }

    private static float findMinAlt(){
        float min = findMaxAlt();
        for (Cord cord : list) {
            if(cord.getAlt() < min) min = cord.getAlt();
        }
        return min;
    }

}
