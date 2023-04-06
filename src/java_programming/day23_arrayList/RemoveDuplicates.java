package java_programming.day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println("......Contains Method..............\n");



        ArrayList<String> names = new ArrayList<>();

        names.add("Jonathan"); // 0
        names.add("Jonathan"); // 1
        names.add("Ebrar");    // 2
        names.add("Ebrar");
        names.add("Nisa");
        names.add("Ebrar");


        ArrayList<String> nonDuplicates = new ArrayList<>();

        for (String each : names) {

            if (nonDuplicates.contains(each)){
             continue;
            }
            nonDuplicates.add(each);
        }

        // [Jonathan, Ebrar, Nisa]

        names = nonDuplicates;  // we can let the 'names' object unreferenced, then we can assign new object that we have

        System.out.println(names);
        System.out.println(nonDuplicates);
        System.out.println();

        System.out.println("......Equals Method.................\n");


        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = list1; // they are one equal object, they allocate 1 location in the heap memory


        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);



        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2); // empty

        System.out.println(l1 == l2); // false


        System.out.println(l1.equals(l2));

        System.out.println("............................");



        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);


        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(30);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2)); // It's not in the same order that's why they are not equal even if they have the same objects, and it gives always false.



        System.out.println("......Empty Method..............\n");


        System.out.println(n1.isEmpty()); // checking if the list doesn't have any elements
        System.out.println(n2.isEmpty()); // it returns false

        n1.clear(); // clear all the elements
        n2.clear();

        System.out.println(n1.isEmpty()); // now it returns true
        System.out.println(n2.isEmpty());
    }
}
