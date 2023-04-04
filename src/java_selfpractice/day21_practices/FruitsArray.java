package java_selfpractice.day21_practices;

import java.util.Arrays;

public class FruitsArray {

    public static void main(String[] args) {

        /*
        Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado


         */

        System.out.println("1.\t");

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };


        for (String[] eachFruits : items) {
            for (String eachElements : eachFruits) {
                System.out.print(" \t"+ eachElements + " \t");
            }
            System.out.println();
        }

        System.out.println("2.\t");


        for (String[] eachItem : items) {
            String reverse = "";

            for (int i = eachItem.length - 1; i >= 0; i--) {
                reverse += "\t"+eachItem[i] + "\t";
            }
            System.out.println(reverse);
        }




        System.out.println("3.\t");


        for (int i = items.length - 1; i >= 0; i--) {
            String [] item = items[i];
            for (String s : item) {
                System.out.println(s + "\t");
            }
            System.out.println();
        }

      /*  for (String[] eachItem : items[2]) {
            String reverseLastToFirst = "";
*/






        }
    }






