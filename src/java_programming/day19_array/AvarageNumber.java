package java_programming.day19_array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AvarageNumber {
/*
AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number
 */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int total = input.nextInt();


        int[] numbers = new int[total];

        int sum = 0;
        for (int i = 0; i < total; i++) { // total is like length of the given elements
            System.out.println("Enter a number");
           numbers[i] =  input.nextInt();
           sum += numbers[i];
        }

        double avarage = sum / (double)total;
         /* we made above explicit casting to double cause int / int gives =  int --> we want average num that's why one of should be decimal numbers like
         int / double = double
        */

        DecimalFormat df = new DecimalFormat ("0.00");
        /*
        above we use decimal format in order to print the decimal number only given format such as; 12.3456788 --> 12.34 --> it doesn't change the original value
         */



        System.out.println("numbers: " + Arrays.toString(numbers));
        System.out.println("sum = " + sum);
        System.out.println("avarage = " + avarage);
        System.out.println("avarage: " + df.format(avarage));




    }
}
