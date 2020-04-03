public class Cord {

    private int timestamp;
    private float lat;
    private float log;
    private float alt;

    public Cord(int timestamp, float lat, float log, float alt) {
        this.timestamp = timestamp;
        this.lat = lat;
        this.log = log;
        this.alt = alt;
    }

    public Cord() {
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
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
}
