package java_programming.day06_ifStatements;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 20;


        boolean isEven = number % 2 == 0; // when we divide a number by 2, if the remainder is 0,means the number is even number.


       // 1.way ....>>> boolean isOdd = number % 2 != 0;   // when we divide a number by 2, if the remainder is not equal to 0,means the number is odd number.

        boolean isOdd = !isEven; // If the number is not even, then it's odd. we use here opposite (logical not operator  '!').

        System.out.println(number + " is an even number: " + isEven );
        System.out.println(number + " is an odd number: " + isOdd );

        System.out.println("...........");


        if (number % 2 == 0) {

            System.out.println("Even number");
        }

        if (number % 2 != 0) {

            System.out.println("Odd number");
        }





    }
}

/*

1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)

 */