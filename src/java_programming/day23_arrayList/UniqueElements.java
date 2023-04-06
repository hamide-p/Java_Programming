package java_programming.day23_arrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Jonathan"); // 0
        names.add("Jonathan"); // 1
        names.add("Ebrar");
        names.add("Ebrar");
        names.add("Nisa");
        names.add("Ebrar");
        names.add("Can");
        names.add("Emilia");
        names.add("Emilia");

        for (String each : names){

            if (names.indexOf(each) == names.lastIndexOf(each)){ // 1st and last time that this name has occurred , then it means this name is unique.
                System.out.println(each);
               // break; --> it just give the first unique name



                System.out.println("............................");



                boolean hasMuhtar = names.contains("Muhtar"); // false
                boolean hasEbrar = names.contains("Ebrar"); // true



                System.out.println("hasMuhtar = " + hasMuhtar);
                System.out.println("hasEbrar = " + hasEbrar);


            }
        }

    }
}
