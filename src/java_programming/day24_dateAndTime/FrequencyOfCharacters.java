package java_programming.day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {


    public static void main(String[] args) {


        String str = "aaabbbbccccc";

        // output: a3b4c5
        
        String result = "";





        for (String each : str.split("")){


        int frequency = Collections.frequency(Arrays.asList(str.split("")),each);

        if (!result.contains(each)){ // if the string doesn't contain yet, then adding those character to the result
            result += each + frequency;
        }

        }

        System.out.println(result);


        /*

         To find the frequency of each character:

* First, convert the string to an array of strings by using the split method.
* This will give you an array that contains each character of the string as a separate element.
* If you have a non-primitive string array, it can be converted to the Collection type.
* Then, iterate through the array and add each character to a frequency variable to find its frequency.
* To avoid duplication in the result, you can use an if statement to check if the character already exists in frequency. If it does, simply increment its frequency. If it doesn't, add it to the result variable with a frequency of 1.
* Finally, concatenate the characters and their frequencies to generate the output. For example, "a3b4c5".



         */

    }
}
