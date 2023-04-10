package java_selfpractice.day24_practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveStringElements {

    public static void main(String[] args) {

        /*
        Write a program that can remove string elements from an arraylist if the first and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		[Canada, Lan, Ebrahim, Farida]
         */


        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));


        int firstIndex = names.indexOf(0);
        int lastIndex = names.lastIndexOf(firstIndex)-1;






    }
}
