package assessment;

import javax.swing.*;

public class TestCountry {
    public static void main(String[] args) {

        City city1 = new City("Cork", 124391, new Location(51.8985, 8.4756));
        City city2 = new City("Galway", 79934, new Location(53.2707, 9.0568));
        City city3 = new City("Dublin", 544107, new Location(53.3498, 6.2603));
        City city4 = new City("Limerick", 194899, new Location(52.6638, 8.6267));
        City city5 = new City("Waterford", 53504, new Location(52.2593, 7.1101));

        City[] cities = new City[]{city1, city2, city3, city4, city5};

        Country country = new Country("Ireland", "Dublin", 4904000, 70273, cities, "euro", "English");

        int res = JOptionPane.showConfirmDialog(null, country.toString(), "Country Details", JOptionPane.DEFAULT_OPTION);

        if (res == 0) {
            res = JOptionPane.showConfirmDialog(null,
                    "The distance between Limerick and Dublin is: " + Math.round(City.getDistanceBetween(city4, city3) * 100) / 100.0 + "km",
                    "Distance Between Limerick and Dublin",
                    JOptionPane.DEFAULT_OPTION);
        }

        if (res == 0) {
            res = JOptionPane.showConfirmDialog(null,
                    "The details of the most populous city are: \n\n" + country.getMostPopulousCity().toString(),
                    "Details of the Most Populous City", JOptionPane.DEFAULT_OPTION);
        }

        if (res == 0) {
            country.sortCitiesByName();
        }

        System.exit(0);
    }
}
