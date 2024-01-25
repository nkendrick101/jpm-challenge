import java.util.*;
public class CountriesSort {
    public static void main(String args[]){
        ArrayList<String> listOfCountries = new ArrayList<>();
        listOfCountries.add("Russia");
        listOfCountries.add("US");
        listOfCountries.add("China");
        listOfCountries.add("UK");

        // Original unsorted list
        System.out.println("Before Sorting: "+ listOfCountries);

        //Sorting the ArrayList using sort() method
        Collections.sort(listOfCountries);

        // Printing sorted ArrayList
        System.out.println("After Sorting: "+ listOfCountries);
    }
}