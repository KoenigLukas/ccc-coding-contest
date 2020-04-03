import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Level2 {
    public static LinkedList<Cord> cords = new LinkedList<>();


    private static LinkedList<Flight> flights = new LinkedList<>();

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("./2-level/files/level2_5.in"))){
            String line;
            reader.readLine();
            while ((line= reader.readLine())!=null) {
                String[] elems=line.split(",");

                Flight flight = new Flight(elems[4],elems[5],Integer.parseInt(elems[6]));
                if(flights.contains(flight)){
                    for (Flight flight1 : flights) {
                        if(flight1.equals(flight) && !flight1.containsTime(Integer.parseInt(elems[6]))){
                            flight1.addCount(1);
                            flight1.addTime(Integer.parseInt(elems[6]));
                        }
                    }
                } else{
                    flights.add(flight);
                }

            }



            Collections.sort(flights, new Comparator<Flight>() {
                @Override
                public int compare(Flight o1, Flight o2) {

                    String x1 = o1.getTakeoff();
                    String x2 = o2.getTakeoff();
                    int sComp = x1.compareTo(x2);

                    if (sComp != 0) {
                        return sComp;
                    }

                    String x3 = o1.getDest();
                    String x4 = o2.getDest();

                   return x3.compareTo(x4);

                }
            });
            flights.size();
            int sum = 0;
            for (Flight flight : flights) {
                System.out.println(flight.getTakeoff()+" "+flight.getDest()+" "+flight.getCount());
                sum += flight.getCount();
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private static int findMaxTime(){
        int max = 0;
        for (Cord cord : cords) {
            if(cord.getTimestamp() > max) max = cord.getTimestamp();
        }
        return max;
    }

    private static int findMinTime(){
        int min = findMaxTime();
        for (Cord cord : cords) {
            if(cord.getTimestamp() < min) min = cord.getTimestamp();
        }
        return min;
    }

    private static float findMaxLat(){
        float max = 0;
        for (Cord cord : cords) {
            if(cord.getLat() > max) max = cord.getLat();
        }
        return max;
    }

    private static float findMinLat(){
        float min = findMaxLat();
        for (Cord cord : cords) {
            if(cord.getLat() < min) min = cord.getLat();
        }
        return min;
    }

    private static float findMaxLog(){
        float max = 0;
        for (Cord cord : cords) {
            if(cord.getLog() > max) max = cord.getLog();
        }
        return max;
    }

    private static float findMinLog(){
        float min = findMaxLog();
        for (Cord cord : cords) {
            if(cord.getLog() < min) min = cord.getLog();
        }
        return min;
    }

    private static float findMaxAlt(){
        float max = 0;
        for (Cord cord : cords) {
            if(cord.getAlt() > max) max = cord.getAlt();
        }
        return max;
    }

    private static float findMinAlt(){
        float min = findMaxAlt();
        for (Cord cord : cords) {
            if(cord.getAlt() < min) min = cord.getAlt();
        }
        return min;
    }

}




