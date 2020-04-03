import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Level2 {
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
}




