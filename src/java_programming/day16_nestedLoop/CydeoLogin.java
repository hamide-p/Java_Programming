package java_programming.day16_nestedLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."

 */
public class CydeoLogin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String u = input.next();


        System.out.println("Enter your password: ");
        String p = input.next();


        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { // if the credentials are correct
            System.out.println("Logged in");
        } else { // otherwise--- when the conditions not true


            // here we use for loop instead of while loop cause when we know the exact number of iteration ----- while loop is best to use  when the iteration number is unknown.

            for (int i = 0; i < 3; i++) { // 0,1,2 you have 3 attempt to enter the correct username and password

/*
                if (i != 2) { //this is the last chance to give the correct u & p
                    System.err.println("Incorrect username or password, please re-enter ");
                } else {
                    System.err.println("This is your last chance, Please re-enter your username and password");
                }

*/


                System.err.println("Incorrect username or password, please re-enter ");
                System.out.println("Enter your username: ");
                u = input.next();


                System.out.println("Enter your password: ");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("You are now logged in");
                    break; // exits the loop -- when it's not valid answer
                }

            }


            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                System.err.println("Your account now is locked, please contact with the support team");
            }

        }

        input.close();





    }
    // custom method between main method and class

    public static void cydeoLogIn(String username, String password) {
        if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {
            System.out.println("Invalid credentials"); // you can use above loop here but if you want only one attempt then use like this

        }
    }




}