package java_selfpractice.day22_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoStringArray {

    public static void main(String[] args) {


        /*
        write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
         */


       String[] arr1 = {"A", "B", "C"};
       String[] arr2 = {"D", "E", "F", "G"};


        ArrayList<String> list = new ArrayList<>();


        /*
        list.addAll(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));
        System.out.println(list);
        */    //shortest way to use



        for (String each : arr1) {
            list.add(each);
            }

        for (String each : arr2){
                list.add(each);
            }

        System.out.println(list);


    }
}
