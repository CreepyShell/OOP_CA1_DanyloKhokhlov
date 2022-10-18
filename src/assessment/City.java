package assessment;

public class City {
    private String name;
    private int population;
    private Location location;

    public City(String name, int population, Location location) {
        this.setName(name);
        this.setLocation(location);
        this.setPopulation(population);
    }

    public static double getDistanceBetween(City city1, City city2) {
        if (city1 == null || city2 == null)
            return -1;
        double latitudeInRadians = Math.PI * city2.getLocation().getLatitude() / 180.0;
        return 110.25 * Math.sqrt(
                (Math.pow((city1.getLocation().getLatitude() - city2.getLocation().getLatitude()), 2) +
                        Math.pow((city1.getLocation().getLongitude() - city2.getLocation().getLongitude()) * Math.cos(latitudeInRadians), 2)));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population < 0) {
            this.population = 0;
            return;
        }
        this.population = population;
    }

    public Location getLocation() {
        return new Location(this.location.getLatitude(), this.location.getLongitude());
    }

    public void setLocation(Location location) {
        this.location =
                new Location(location.getLatitude(), location.getLongitude());
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() +
                ", Population: " + this.getPopulation() +
                ", Location: " + this.getLocation().toString() + "\n";
    }
}
