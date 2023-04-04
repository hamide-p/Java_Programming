package java_programming.day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {
/*
 Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};

 */
    public static void main(String[] args) {



        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};


        int[] reverse = new int[array.length]; //

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            /*        5              ,   = 0  5 >= 0  5-1, 0+1
                      4              ,   = 1  4 >= 0  4-1, 1+1
                      3              ,   = 2  3 >= 0  3-1, 2+1
                      2              ,   = 3  2 >= 0  2-1, 3+1
                      1              ,   = 4  1 >= 0  1-1, 4+1
                      0              ,   = 5  0 >= 0   0    5 */ // descending- ascending order

            reverse [j] = array[i]; // j store the elements here in reversed order but stars from index 0
        }
        System.out.println(Arrays.toString(reverse));

        /*

        int[] array = {1,2,3,4,5};

        int[] reverse = new int[array.length];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            reverse [j++] = array[i];
        }
        System.out.println(Arrays.toString(reverse));


*/ // second way to reverse


        System.out.println(".............");


        int[] nums = {100, 200, 300, 400, 500};

        nums = ArraysUtility.reverse(nums);


        System.out.println(Arrays.toString(nums));

        System.out.println("............");


        double[] a1 = {1.5, 2.5, 3.5, 4.5};

        a1 = ArraysUtility.reverse(a1);

        System.out.println(Arrays.toString(a1));

        System.out.println(".............");


        String[] str1 = {"hamide", "mina", "yunus"};
        str1 = ArraysUtility.reverse(str1);
        System.out.println(Arrays.toString(str1));

    }
}
