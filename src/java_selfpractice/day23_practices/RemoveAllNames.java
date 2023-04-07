package java_selfpractice.day23_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllNames {

    public static void main(String[] args) {

        /*
        Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];
         */


        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Daniel", "James", "Muhammed"));

      /*
       names.add("John");
       names.add("Ahmed");
       names.add("Daniel");
       names.add("Ahmed");
       names.add("James");
       names.add("Muhammed");
       */ // old version to add names

       names.removeAll(Arrays.asList("Ahmed"));

       System.out.println(names);


       /* // we use for each nested loop inorder to first count all occurrences of "Ahmed" then, we remove all occurrences of "Ahmed" using a for loop with the count as the loop condition.


        int count = 0;

        for (String each : names){

            if (each.equals("Ahmed")){
                count++;
            }

            for (int i = 0; i < count; i++) {
                names.remove("Ahmed");
            }
        }

        System.out.println(names);
        */ // 2nd solution


        /*

        // we use for loop and check if each element is equal to "Ahmed". If it is, we remove that element from the ArrayList

        for (int i = 0; i < names.size(); i++) {

            if (names.get(i).equals("Ahmed")){
                names.remove(i);
                   }
        }

        System.out.println(names);


                */ // 3rd solution

    }
}
