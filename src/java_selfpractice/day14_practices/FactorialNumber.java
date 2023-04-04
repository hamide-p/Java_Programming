package java_selfpractice.day14_practices;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int num =input.nextInt();
        int  factorial = 1;
     


        for( int i = 1; i<= num; i-- ){
            
                factorial *= i;
            }

        input.close();

        System.out.println("factorial = " + factorial);
        
        
        }
        
    }


/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */