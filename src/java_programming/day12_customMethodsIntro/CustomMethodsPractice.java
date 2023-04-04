package java_programming.day12_customMethodsIntro;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        isEligibleToBuyAlcohol(12);

        System.out.println(".......................");

        isEvenOddZero(3);

        System.out.println(".......................");

        maxNum(10000,50000);
        maxNum(10.5, 20.5);
        maxNum(-200, -20);


        System.out.println(".......................");


        initial("Mohammad", "Karim");

    }

    // create a method that can check if person is eligible to buy alcohol
    public static void isEligibleToBuyAlcohol(int age) {

        if (age >= 21) {
            System.out.println("is eligible to buy alcohol");
        } else {
            System.out.println("is not eligible to buy alcohol");
        }


    }


    // create a method that can check if a number is even, odd or zero
    public static void isEvenOddZero(int num) {

        if (num % 2 == 0) {
            System.out.println("the number is even");
        } else if (num % 2 != 0) {
            System.out.println("the number is odd");
        } else {
            System.out.println("the number is zero");
        }


    }


    // create a method that can calculate the grade of the students

    public static void gradeOfStudents(int score) {

        if (score <= 90 ) {
            System.out.println("Grade is A");
        } else if (score <= 80 ) {
            System.out.println("Grade is B");
        } else if (score <= 70 ) {
            System.out.println("Grade is C");
        } else if (score <= 60 ) {
            System.out.println("Grade is D");
        } else {
            System.out.println("Grade is F");
        }



    }

    // create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)
    public static void maxNum(double num1, double num2) {

        if(num1>num2){
            System.out.println(num1 + " is the maximum number");
        }else if (num2>num1) {
            System.out.println(num2 + " is the maximum number");
        }else {
            System.out.println("Equal");
        }


    }




        //Create a method that can display the initials of a person  (firstName, lastName)


     public static void initial (String firstName, String lastName){


        String initial = firstName.charAt(0)  + "." + lastName.charAt(0);

        System.out.println("Initial: " + initial);




     }





        }












