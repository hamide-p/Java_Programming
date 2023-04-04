package java_programming.day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String answer = "yes";


        while(answer.equals ("yes")) { // if the answer is yes then you repeat the process over an over


            System.out.println("Enter a number");
            int number = input.nextInt();


            if (number % 2 == 0) {
                System.out.println(number + "is an even number");
            } else {
                System.out.println(number + "is an odd number");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            answer = input.next(); // there is a bug we should give a warning to all answers except for the yes or no answer.


            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry! Would you like to enter another number? Yes/No");
                answer = input.next().toLowerCase();


                if (answer.equals("no")) {

                    break; // it's within the loop

                }
            }

        }







    }
}
