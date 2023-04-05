package java_selfpractice.day22_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxAndMinNum {
    public static void main(String[] args) {

        /*
        Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1
         */


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,-2,300,0)); // adding multiple elements at once

        int max = list.get(0); // initialize the variables max and min to the first element of the ArrayList
        int min =list.get(0);


       /*
       // Predetermined constants in the Integer class that represent the minimum and maximum values of the int data type.

        int max = Integer.MIN_VALUE; // min value of int -2147483648
        int min = Integer.MAX_VALUE; // max value of int--- 2147483647

        */ // Alternative way for assigning min and max

        for (Integer each : list){

            if (each > max){
                max = each;

            }

            if (each < min){
                min = each;

            }
        }


        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
