package day06_ifStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {


       int number = 65;

       boolean isdivisibleBy2 = number % 2 == 0; // if the remainder of number divided by 2 is equal to zero, then it's evenly divisible by 2
       boolean isdivisibleBy3 = number % 3 == 0; // if the remainder of number divided by 3 is equal to zero, then it's evenly divisible by 3
       boolean isdivisibleBy5 = number % 5 == 0; // if the remainder of number divided by 5 is equal to zero, then it's evenly divisible by 5

        System.out.println(number + " is divisible by 2: " + isdivisibleBy2 );
        System.out.println(number + " is divisible by 3: " + isdivisibleBy3 );
        System.out.println(number + " is divisible by 5: " + isdivisibleBy5 );

        /*
            number : 45
            divisible by 2   false
            divisible by 3   true   45 / 3 = 15 there is no remainder
            divisible by 5   true   45 / 5 = 9 there is no remainder

            number : 30
            divisible by 2   true   30 / 2 = 15 there is no remainder
            divisible by 3   true   30 / 3 = 10 there is no remainder
            divisible by 5   true   30 / 5 = 6 there is no remainder

         */







    }
}

/*
Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

            Evenly Divisible ==> remainder is zero



Single If Statement: can be used for creating condition for one possible output

 */