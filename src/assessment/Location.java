package assessment;

public class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.setLatitude(latitude);
        this.setLongitude(longitude);
    }

    @Override
    public String toString() {
        return " Latitude: " + getLatitude() +
                " Longitude: " + getLongitude();
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
