package java_selfpractice.day15_practices;

import java.util.Scanner;

public class PositiveNegative {

    /*
    Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
     */


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter five numbers");


        int positive = 0;
        int negative = 0;
        int number = 0;


        for (int i = 0; i < 5; i++) {
            number = input.nextInt();

            if (number == 0) {
                continue;
            }
            if (number > 0) {
                positive++;
            } else {
                negative++;
            }
        }

            System.out.println(positive + " positive and " + negative + " negative");


            input.close();

    }
}

