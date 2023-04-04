package java_selfpractice.day15_practices;

import java.util.Scanner;

public class UntilNegative {

/*

5. Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

 */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int  number = input.nextInt();
        int sum = 0;

        while(number > 0 ){

            System.out.println("Enter a new number");
             number = input.nextInt();


            if (number < 0){
                break;
            }
                sum += number;

            }




            System.out.println(sum);
             input.close();







    }

    }


