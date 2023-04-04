package java_programming.day16_nestedLoop;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String u, p;

        int attempt = 3;

        do{
            System.out.println("Enter your user name:");
            u = input.next();

            System.out.println("Enter your password: ");
            p = input.next();


            attempt--; // after first executuin we will decrease the number of attempt


            if(attempt == 0){ // after reaching the last attempt '3' then we stop the execution
                break;
            }






        }while (! (u.equals ("Cydeo") && p.equals("WoodenSpoon")) ); // while the credentials are invalid














    }
}
