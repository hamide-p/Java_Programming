package java_live_review.week7;


import java.sql.SQLOutput;
import java.util.Scanner;

/*
Create a program that will define an array with all the months in order. Use this array to help print the full name of a month by giving a number

	Ex:
44444		input: 1
		output: January

		input: 11
		output: November

	Other variations of this task we have done before: word to number, number to word

 */
public class Months {

    public static void main(String[] args) {


       Scanner input = new Scanner(System.in);
        System.out.println("Hello, enter the month number 1- 12");
        int month = input.nextInt();


        if (month >= 1 && month <= 12){
            String[] data = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

            System.out.println(data[month - 1]);

        } else {
            System.out.println("Sorry " + month + " is not a valid month number");
        }



    }
}
