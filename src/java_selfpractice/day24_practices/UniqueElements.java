package java_selfpractice.day24_practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        /*
         Write a program that can display the unique elements of an arrayList:
		ex:
			list = [1, 1, 2, 3, 3, 4, 5, 5]

		output:
			[2, 4]

	Note: DO NOT use any loops
         */


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        //removeIf() method to remove the elements that are not unique by checking their first and last index in the list.
       list.removeIf(p -> list.indexOf(p) !=list.lastIndexOf(p) );
        System.out.println(list); // Then show the remaining unique elements in the output



    }
}
