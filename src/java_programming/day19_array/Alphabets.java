package java_programming.day19_array;


import java.util.Arrays;

/*
 Create a char array and store all the alphabet letters in ascending order

 Create a char array and store all the alphabet letters in descending order
 */
public class Alphabets {
    public static void main(String[] args) {


        char[] ascending = new char[26]; //index:  0 ~ 25
        char[] descending = new char[26]; // index: 0 ~ 25

        for (int i = 0, j = 'A', k = 'Z'; i < ascending.length; i++, j++, k--) {
          ascending[i] = (char) j;  // j is int that's why we explicit into char
            descending[i] = (char) k; // k is int that's why we explicit into char
        }


        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));







    }
}
