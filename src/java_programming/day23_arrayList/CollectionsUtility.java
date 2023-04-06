package java_programming.day23_arrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8));

        int max = Collections.max(list); // apply a collection type --> unboxing
        int min = Collections.min(list);

        System.out.println("max = " + max); // 8
        System.out.println("min = " + min); // 1

        System.out.println("\n............................\n");

        ArrayList<String>  items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Potato",  "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels"));

        Collections.sort(items); // sorting in ascending order --> 'a' to 'z'

        System.out.println(items);

        System.out.println("\n............................\n");

        Collections.reverse(items); // reverse the order of the elements in the specified collection
        System.out.println(items); // reversing in descending order

        System.out.println("\n............................\n");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(  Arrays.asList("Junus", "Mina", "Nalan", "Selma" )   );

        System.out.println(students); // [Junus, Mina, Nalan, Selma]

        Collections.swap(students, 0 , 1); // it changes the elements and index orders

        System.out.println(students); // [Mina, Junus, Nalan, Selma]

        Collections.swap(students, 0, students.size()-1); // swap the first and last elements

        System.out.println(students); // [Selma, Junus, Nalan, Mina]




    }
}
