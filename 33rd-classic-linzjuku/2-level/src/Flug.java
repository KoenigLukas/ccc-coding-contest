import java.util.Objects;

public class Flug{

    private String dest;
    private String start;
    private int amout;

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public int getAmout() {
        return amout;
    }

    public void setAmout(int amout) {
        this.amout = amout;
    }

    public Flug(String start, String dest, int amout) {
        this.dest = dest;
        this.start = start;
        this.amout = amout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flug flug = (Flug) o;
        return Objects.equals(dest, flug.dest) &&
                Objects.equals(start, flug.start);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dest, start);
    }


}
