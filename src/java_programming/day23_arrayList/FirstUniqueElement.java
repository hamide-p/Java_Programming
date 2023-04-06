package java_programming.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement {
    public static void main(String[] args) {

        /*
        Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

			output:
				2

         */

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6));

        System.out.println(list);



        for (Integer element : list){ // 1
            int frequency = 0;

            for (Integer each : list) { // finding the frequency of each element
                if (each == element){
                    frequency++;
                }
            }
            if(frequency == 1){ // checking if the element is unique
                System.out.println(element);
                break; // exiting the loop - in order to return the first unique element only
        }

        }
        
        


    }
}
