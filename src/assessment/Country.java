package assessment;


import javax.swing.*;
import java.util.Arrays;

public class Country {
    private String name;
    private String capital;
    private int population;
    private int area;
    private City[] cities;
    private String currency;
    private String language;

    public Country(String name, String capital, int population, int area, City[] cities, String currency, String language) {
        this.setName(name);
        this.setCapital(capital);
        this.setPopulation(population);
        this.setArea(area);
        this.setCities(cities);
        this.setCurrency(currency);
        this.setLanguage(language);
    }

    @Override
    public String toString() {

        String localCities = "";
        for (City city : this.getCities()) {
            if (city != null) {
                localCities += city.toString();
            }
        }
        return "Name: " + this.getName() +
                "\nCapital: " + this.getCapital() +
                "\nPopulation: " + getPopulation() +
                "\nArea: " + getArea() +
                "\nCities:\n\n" + localCities +
                "\n\nCurrency: " + this.getCurrency() +
                "\nLanguage: " + this.getLanguage() + "\n\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if (area < 0) {
            this.area = 0;
            return;
        }
        this.area = area;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public City getMostPopulousCity() {
        int population = -Integer.MAX_VALUE;
        City city = null;
        for (City largeCity : this.getCities()) {
            if (largeCity != null && largeCity.getPopulation() > population) {
                population = largeCity.getPopulation();
                city = largeCity;
            }
        }
        return city;
    }

    public void sortCitiesByName() {
        City[] copyOfCities = Arrays.copyOf(this.getCities(), this.getCities().length);
        for (int i = 0; i < copyOfCities.length; i++) {
            for (int j = i + 1; j < copyOfCities.length; j++) {
                if (copyOfCities[i].getName().compareTo(copyOfCities[j].getName()) > 0) {
                    City swap = copyOfCities[j];
                    copyOfCities[j] = copyOfCities[i];
                    copyOfCities[i] = swap;
                }
            }
        }

        String cities = "";
        for (City city : copyOfCities) {
            cities += city.toString();
        }
        JOptionPane.showMessageDialog(null,
                "The cities sorted by name are: \n\n" + cities,
                "Cities Sorted by Name", 1);

    }
}
