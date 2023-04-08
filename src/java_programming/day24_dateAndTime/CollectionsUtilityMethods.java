
package java_programming.day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        System.out.println(names);

        /*
      *  replace all the elements "Java" with "Python"
      *  it's best to use with "for loop" when you want to change "Java" with Upper case & Lower case, then use equalsIgnoreCase() method*/
        /*

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("Java")){
                names.set(i, "Python");
            }
        }*/


        // short version to solve
        Collections.replaceAll(names, "Java", "Python");

        System.out.println(names);

        System.out.println("\n..............................");

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 50, 50 ,50, 50, 60, 50, 50, 50 ));

       int count =  Collections.frequency(list,50); // compare this element with ArrayList , when its matching then its counting++ the frequency by 1


        System.out.println(count);





        System.out.println("\n..............................");


        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));


        // frequency
        int countJava =  Collections.frequency(words,"Java");


        System.out.println(countJava);


        System.out.println("\n..............................");


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(10, 20, 30, 40, 50, 50, 50 ,50, 50, 60, 50, 50, 50 ));

        for (Integer each : numbers) {

            // finding the unique numbers with frequency method
            if (Collections.frequency(numbers, each) == 1){
                // When each number appears exactly once in the ArrayList (i.e., there are no duplicate elements), then those numbers are considered unique.

                System.out.println(each);
            }
        }





    }
}

