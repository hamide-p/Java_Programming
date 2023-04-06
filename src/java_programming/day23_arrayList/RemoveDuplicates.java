package java_programming.day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {


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





    }
}
