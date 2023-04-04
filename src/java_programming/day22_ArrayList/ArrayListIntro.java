package java_programming.day22_ArrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {

        int[] array = new int[5]; // {0, 0, 0, 0, 0}

        array[0] = 10; // {10, 0, 0, 0, 0}
        array[1] = 20; // {10, 20, 0, 0, 0}
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

       // array[5] = 60; --> ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(array));

        System.out.println("....................");


      //  ArrayList<int> list = new ArrayList<>();  --> non-primitive data type can't support in the Array list.

        ArrayList<Integer> list = new ArrayList<>();


        System.out.println(list);// list is empty

        System.out.println(list.size()); // 0 elements in the list




    }
}
