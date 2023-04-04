package java_programming.day19_array;

import java.util.Arrays;

public class ArrayObjects {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = arr1;
        int[] arr3 = arr2;

        arr1[0] = 1000;
        arr2[2] = 3000;

        System.out.println(Arrays.toString(arr1) );
        System.out.println(Arrays.toString(arr2) );
        System.out.println(Arrays.toString(arr3) );




        System.out.println("----------------------------------------------------");

        String[] a1 = {"Umran", "Mehmet"}; // eligible for garbage collection

        a1 = new String[]{"James", "Daniel"}; // you can assign new array object that is already been created  & use curly braces for elements inside


        /*
        --> multiple objects can not be referenced by one reference variable
        --> it will reference only one object but
        --> when you have one object it can be referenced by multiple reference variables then whichever reference variable that u call inorder to update this array it will updated all of those variables

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = arr1;
        int[] arr3 = arr2;

         arr1[0] = 1000;
        arr2[2] = 3000;   at the end all the variables has 3000 at index number 2

         */

        System.out.println(Arrays.toString(a1));




    }

}




