package java_selfpractice.day14_practices;

import java.util.Scanner;

public class CalculateTheSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int num =input.nextInt();
        int sum = 0;




        for( int i = 1; i<= num; i++ ){

            sum += i;   // sum = sum + i;
        }

        System.out.println("sum = " + sum);

        input.close();
    }
}
/*
write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */