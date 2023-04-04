package java_programming.day06_ifStatements;

public class IdentifyNumber {


    public static void main(String[] args) {


        int number = 200;

        boolean isPositive = number > 0; // if the number is greater than zero, then it's a positive number
        boolean isNegative = number < 0; // if the number is smaller than zero, then it's a negative number
      //1.way....>>  boolean isZero = number == 0; // if the number is equal to zero, then it's zero
        boolean isZero = !isPositive && !isNegative; //  false && true ---->> if the number is NOT positive and NOT negative, then it's zero (2.nd way to use )

        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);


    }
}

/*
 Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */