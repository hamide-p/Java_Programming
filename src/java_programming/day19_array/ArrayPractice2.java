package java_programming.day19_array;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {


        int[] arr1 = new int[100];


        /*

        for (int i = 0, j = 1; i < arr1.length; i++, j++) {
            arr1[i] = j;
        }

       */    // increased by 1 time

        /*

        for (int i = 0, j = 10; i < arr1.length; i++, j+= 10) {
            arr1[i] = j;
        }

*/   // increased by 10 time


        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1; // pattern that gives the element between  1~100
        }

        System.out.println("arr1 = " + Arrays.toString(arr1));


        System.out.println("...................");

        int[] arr2 = new int[100]; // index: 0 ~ 9

         /*
        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] = i+1;
        }
*/ // index 99 ~ 0 but it print still from 0 ~100

        /*
        for (int i = 0 , j = 100; i < arr2.length; i++, j--) {
            arr2[i] = j;
        }

*/// index 99 ~ 0 it print as reversed


        for (int i = 0 ; i < arr2.length; i++) {
            arr2[i] = 100- i;
        } // when we don't use the secondary variable (j) then u should create your own pattern



        System.out.println("arr2 = " + Arrays.toString(arr2) );





    }
}
