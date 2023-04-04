package java_selfpractice.day09_practices;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double result= 0;

        System.out.println("Enter the first number");
        double firstNumber = input.nextDouble();


        System.out.println("Enter a math operator");
        char mathOperator = input.next().charAt(0);



        System.out.println("Enter the second number");
        double secondNumber = input.nextDouble();




        if( mathOperator == '+' ||  mathOperator == '-' || mathOperator == '*' || mathOperator == '/' ) {


        } if (mathOperator == '+'){
            result = firstNumber + secondNumber;

        }else if (mathOperator == '-'){
            result = firstNumber - secondNumber;

        }else if (mathOperator == '*'){
            result = firstNumber * secondNumber;

        }else if (mathOperator == '/'){
            result = firstNumber / secondNumber;

        } else{
            System.out.println("Invalid entry");
        }

        System.out.println(result);


        input.close();


    }
}
 /*
 Create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a valid math operator (+, -, *, /), then print "Invalid entry"


  */