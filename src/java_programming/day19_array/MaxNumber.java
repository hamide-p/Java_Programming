package java_programming.day19_array;

public class MaxNumber {

/*
 Write a program that can find the maximum number from an array
 */
    public static void main(String[] args) {



      int[] numbers = {100, 20, 500, 40, -10, 30};

      int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) { // i:1, 3, 4, 5, 6
           if(numbers[i] > max){ // compares the element of the array with cureent max number
               max = numbers[i]; // replace the current max number
           }
        }

        System.out.println("max = " + max);

    }
}

