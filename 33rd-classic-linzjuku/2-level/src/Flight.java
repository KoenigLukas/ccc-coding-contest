import java.util.ArrayList;
import java.util.Objects;

public class Flight implements Comparable<Flight>{

    private String takeoff;
    private String dest;
    private ArrayList<Integer> timelist = new ArrayList<>();
    private int count = 1;

    public Flight(String takeoff, String dest,int time) {
        this.takeoff = takeoff;
        this.dest = dest;
        this.timelist.add(time);
    }

    public String getTakeoff() {
        return takeoff;
    }

    public void setTakeoff(String takeoff) {
        this.takeoff = takeoff;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void addCount(int add){
        count += add;
    }

    public void addTime(int time){
        timelist.add(time);
    }

    public boolean containsTime(int time){
        return timelist.contains(time);
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(takeoff, flight.takeoff) &&
                Objects.equals(dest, flight.dest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(takeoff, dest);
    }

    @Override
    public int compareTo(Flight o) {
        return this.getTakeoff().compareTo(o.getTakeoff());
    }
}
