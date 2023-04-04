package java_programming.day21_multiDimensionalArray;

import java.util.Arrays;

public class Anagram {


    public static void main(String[] args) {

        /*
        Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
            	str2 = "earth"

            output:
            	true

        		str1 = "java"
        		str2 = "python"

    		output:
    			false


        listen  silent


         */



        String str1 = "heart"; // aehtr -->sort method
        String str2 = "earth"; // aehtr


      //  String[] a1 =  str1.split(""); // we can get each character by splitting

        char[] a1 =  str1.toCharArray();
        char[] a2 =  str2.toCharArray();

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        System.out.println(".............................");
        
        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        boolean isAnagram = Arrays.equals(a1,a2);

        System.out.println("isAnagram = " + isAnagram); // if they are equal, then they are Anagram. They include same characters and same size.

    }
}
