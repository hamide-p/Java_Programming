package java_selfpractice.day24_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountryNames {

    public static void main(String[] args) {


        /*
        Create an ArrayList of string called country names, write a program that can remove all the country names that have length of 10 or greater
         */



        ArrayList<String> countryNames = new ArrayList<>();

        countryNames.addAll(Arrays.asList("Japan", "Luxembourg", "Kazakhstan", "Turkei", "Germany", "El Salvador", "New Zealand", "Seychelles" ,"Netherlands", "Bahamas", "Belgium", "Australia"));

        countryNames.removeIf(p -> p.length() >=10 );

        System.out.println(countryNames);
    }
}
