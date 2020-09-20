package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class HashmapLesson {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);


        HashMap<String, ArrayList<String>> ciudades = new HashMap<String, ArrayList<String>>();

        // Add keys and values (Country, City)
        ArrayList<String> citiesEngland = new ArrayList<String>();
        citiesEngland.add("Londres");
        citiesEngland.add("Liverpool");
        citiesEngland.add("Manchester");
        ciudades.put("England", citiesEngland);

        ArrayList<String> citiesUSA = new ArrayList<String>();
        citiesUSA.add("Miami");
        citiesUSA.add("New York");
        citiesUSA.add("Washintong");
        ciudades.put("USA", citiesUSA);



        System.out.println(ciudades);

    }
}