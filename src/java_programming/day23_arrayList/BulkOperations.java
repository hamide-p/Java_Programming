package java_programming.day23_arrayList;

import java_programming.day19_array.ArraysLiteral;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        System.out.println("\n....AddAll() Method..............\n");

        // This method is used to add all the elements from one collection to another collection.
        // Diese Methode wird verwendet, um alle Elemente einer Sammlung einer anderen Sammlung hinzuzufügen.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);


        list1.addAll(1,numbers);

        System.out.println(list1); //added 'numbers' elements after index 1--> [1, 10, 20, 30, 40, 2, 3]

        System.out.println("\n......asList() Method..............\n");

     /*
      This method in is used to convert an array to a List. Any modifications made to the List will be reflected in the original array, and vice versa.

       Diese Methode in wird verwendet, um ein Array in eine Liste umzuwandeln. Alle an der Liste vorgenommenen Änderungen werden im ursprünglichen Array widergespiegelt und umgekehrt.
       */


        ArrayList<Integer> scores = new ArrayList<>();


        scores.addAll(Arrays.asList(75, 85, 95, 70, 80)); // multiple elements adding at once into the array list or any collection type

        System.out.println(scores);

       /*
         Bulk operation methods allows to perform operations on entire collections at once. Commonly used ones:
         addAll(), containsAll(), removeAll(), retainAll(), clear()
       */

        System.out.println("\n............................\n");

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Fine", "Mina", "Mila", "Nori"));

        System.out.println(students); // [Fine, Mina, Mila, Nori]

        System.out.println("............................");

        students.addAll(2,Arrays.asList("Tomi", "Nanu" ,"Kate")); // shifts to the right

        System.out.println(students); // [Fine, Mina, Tomi, Nanu, Kate, Mila, Nori]


        System.out.println("\n............................\n");



        Integer[] nums = {1, 2, 3, 4, 5, 6, 7,8};

        ArrayList<Integer> l1 = new ArrayList<>(); // it has the same type as nums Integer, so it can be convertible

        l1.addAll(Arrays.asList(nums)); // should use collection type not array itself but one exception which is  non-primitive arrays can convertible by [Arrays.] method

      //  int [] nums = {1, 2, 3, 4, 5, 6, 7,8}; we can't use directly primitive data type in array list, but firstly we can convert it wrapper class object then it can be usable


        System.out.println(l1); // [1, 2, 3, 4, 5, 6, 7, 8]

        System.out.println("\n.........2nd way to use.............\n");

        Integer[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(nums2)); // this method can be implicitly called in the constructor of the new arrayList--> overloaded of another collections

        System.out.println(l2); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println("\n....containsAll() Method.......\n");

        // verify if all the elements contain in the array list
        // only accepts collection type as argument

        // Überprüfen Sie, ob alle Elemente in der Array-Liste enthalten sind
        // akzeptiert nur Sammlungstyp als Argument


        ArrayList<String> employeesList = new ArrayList<>();

        employeesList.addAll(Arrays.asList("Zara, Melanie, Sascha, Liana"));

        System.out.println(employeesList); // [Zara, Melanie, Sascha, Liana]

        boolean hasNina = employeesList.contains("Nina");
        boolean hasZaraLiana = employeesList.containsAll(Arrays.asList("Zara","Liana"));
        boolean hasMelanieSaschaMiya = employeesList.containsAll(Arrays.asList("Melanie","Sascha", "Miya"));
        System.out.println("hasMelanieSaschaMiya = " + hasMelanieSaschaMiya); // false --> cause one element doesn't contain in the list

        System.out.println("\n....removeAll() Method.......\n");

        //It is used to remove all the elements from a collection
        //Es wird verwendet, um alle Elemente aus einer Sammlung zu entfernen

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,60,70,10,10,10,20,20,20) );// remove all the elements 10 & 20

        list.removeAll(Arrays.asList(10,20));

        System.out.println(list);// checks all the elements then remove the duplicated ones, size will be decreased --> [30, 40, 50, 60, 70]


        System.out.println("\n....retainAll() Method.......\n");

        //   decrease the size of the Array List--> it's remove all the elements that not matching, it's retain (keep) the elements that are matching.

        // Verringern Sie die Größe der Array-Liste --> es entfernt alle Elemente, die nicht übereinstimmen, es behält die Elemente bei, die übereinstimmen.


        ArrayList<String> developers = new ArrayList<>();

        developers.addAll(Arrays.asList("Zara", "Melanie", "Sascha", "Liana", "Ela", "Ela", "Tuana", "Tuana"));
        
        developers.retainAll(Arrays.asList("Tuana", "Ela"));

        System.out.println("developers = " + developers); // keep only [Ela, Ela, Tuana, Tuana]
        
        
        ArrayList<String> grocerieslist = new ArrayList<>();
        
        grocerieslist.addAll( Arrays.asList("Eggs", "Potato", "Milk", " Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper Towels") );
        
        grocerieslist.retainAll(Arrays.asList("Eggs", "Potato", "Milk", " Tomato")); // removes all the unmatching elements

        System.out.println("grocerieslist = " + grocerieslist); // [Eggs, Potato, Milk,  Tomato]
        
        grocerieslist.removeAll(Arrays.asList("Rice", "Orange", "Strawberry", "Blueberry", "Paper Towels")); // removes all matching elements

        System.out.println("grocerieslist = " + grocerieslist); // [Eggs, Potato, Milk,  Tomato]
        
        
        




    }
}
