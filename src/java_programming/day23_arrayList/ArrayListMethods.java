package java_programming.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};


        array[0] = 100;

        System.out.println(Arrays.toString(array));


        System.out.println("............................");


        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("paper towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);

      //  groceriesList[2] = "Oranges"; --> we can't update like this


        groceriesList.set(2, "Oranges"); // set method doesn't change the size only element

        System.out.println(groceriesList);


        groceriesList.add(2,"Chicken"); // add method doesn't change the element but increases the size

        System.out.println(groceriesList);

        groceriesList.remove(0);

        System.out.println(groceriesList);

        groceriesList.remove("paper towels");

        System.out.println(groceriesList);

        System.out.println("............................");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4

       boolean r1 = numbers.remove(Integer.valueOf(10));  // removing the object


        System.out.println(numbers);

        System.out.println(r1);

        numbers.clear();

        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("............................");


        ArrayList<String> names = new ArrayList<>();

        names.add("Jonathan"); // 0
        names.add("Jonathan"); // 1
        names.add("Ebrar");
        names.add("Ebrar");
        names.add("Nisa");
        names.add("Ebrar");


        System.out.println(names.indexOf("Jonathan")); // start to find from 0 index

        System.out.println(names.lastIndexOf("Jonathan")); // start to find from last index

        System.out.println(names.lastIndexOf("Ebrar"));

        System.out.println(names.lastIndexOf("Nisa"));
    }
}
