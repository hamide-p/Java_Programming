package java_programming.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {

    public static void main(String[] args) {


        String[] arr = {"A", "B", "C", "D"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr)); // converting array to array list



        /*
                   Array and Array List Differences:

       Arrays Advantages:
        * supports both primitive and non-primitive data type,
        * can be multidimensional,
        * has the fastest performance of all among the other data structure (retrieving and managing the data).

       Arrays Disadvantages:
        * size is immutable,
        * that has no many methods that we can use, so we can create custom methods.


        Collection Advantages:
       * size is mutable and dynamic,
       * has lots of ready (custom) methods.

        Collection Disadvantages:
        * can't support primitive data type,
        * can't be multidimensional,
        * it's not as fast as arrays performance.

         */

        System.out.println("\n............................\n");


        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java","Python","C#")); // converting this arraylist to an array

        // String [] languages = list2 // array can't be referenced to the arraylist object

        String [] languages = list2.toArray(new String [10]); //  converting to array via toArray() method and instantiate the size ---> ["Java","Python","C#",null,null,null,null,null,null,]



        String [] languages2 = list2.toArray(new String[0]); // If the number given is smaller than the actual size of the array list, it will be resized (i.e., a new array list will be created) to match the size of the array list.

        System.out.println(Arrays.toString(languages2)); // [Java, Python, C#]


        // another way to use:
       // String [] languages2 = list2.toArray(new String[list2.size()]);


        System.out.println("\n............................\n");


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Integer [] n = nums.toArray(new Integer[0]);

      //  int[] n = nums.toArray(new Integer[0]); // compile error--> collection doesn't accepts primitive data types

        System.out.println(Arrays.toString(n)); // [1, 2, 3, 4, 5, 6, 7]








    }
}
