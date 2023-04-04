package java_programming.day19_array;

import java.util.Arrays;

public class ArraysLiteral {


    public static void main(String[] args) {

        int[] numbers = new int[5];//when we know the total number of the element but don't know the exact elements, then use this way

        int[] nums = {10,20,30,40,50}; // when we know the both we use arrays literal


        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers = " + Arrays.toString(numbers) );
        System.out.println("nums = " + Arrays.toString(nums) );


        System.out.println(".....................");



     //   String[] days = new String[7];

            // element :    1       2           3            4            5
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                //  index   0           1          2             3         4

                //  6          7
                "Saturday", "Sunday"};
        //       5             6



        int n = 1;

        System.out.println(days[n-1]);


        System.out.println(".....................");


        String[] month = {"Jan", "February","March", "April", "May", "June", "July","August", "September", "October", "November", "December"};

        System.out.println("month = " + Arrays.toString(month) );

        System.out.println("......................");


      //  int[] numbers2 = new int[100];


        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);
        }


    }
}


