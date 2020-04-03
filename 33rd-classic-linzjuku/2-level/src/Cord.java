public class Cord {
    private int Timestamp;
    private float lat;
    private float log;
    private float alt;
    private String start;
    private String dest;
    private int takeOff;


    public int getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(int timestamp) {
        Timestamp = timestamp;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLog() {
        return log;
    }

    public void setLog(float log) {
        this.log = log;
    }

    public float getAlt() {
        return alt;
    }

    public void setAlt(float alt) {
        this.alt = alt;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public int getTakeOff() {
        return takeOff;
    }

    public void setTakeOff(int takeOff) {
        this.takeOff = takeOff;
    }

    public Cord(int timestamp, float lat, float log, float alt, String start, String dest, int takeOff) {
        Timestamp = timestamp;
        this.lat = lat;
        this.log = log;
        this.alt = alt;
        this.start = start;
        this.dest = dest;
        this.takeOff = takeOff;
    }

    @Override
    public String toString() {
        return "Cord{" +
                "Timestamp=" + Timestamp +
                ", lat=" + lat +
                ", log=" + log +
                ", alt=" + alt +
                ", start='" + start + '\'' +
                ", dest='" + dest + '\'' +
                ", takeOff=" + takeOff +
                '}';
    }
}
