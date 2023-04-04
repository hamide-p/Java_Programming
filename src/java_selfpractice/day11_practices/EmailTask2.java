package java_selfpractice.day11_practices;
import java.util.Scanner;
public class EmailTask2 {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = input.next();

        input.close();

        String firstName = email.substring(email.indexOf("0") + 1, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        String toUppercase1 = firstName.toUpperCase().charAt(0) + firstName.substring(1);

        String toUppercase2 = lastName.toUpperCase().charAt(0) + lastName.substring(1);



        System.out.println("First name: " + toUppercase1);
        System.out.println("Last name: " + toUppercase2);
        System.out.println("Domain: " + domain);


/*

        String email = "craig_federighi@apple.com";


 String firstName = email.toUpperCase(email.substring(0, email.indexOf("_")));
        String firstName = email.substring(0,email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String rest = email.substring(email.indexOf("@"),email.length());

        String upperCase = firstName.toUpperCase(0,firstName.indexOf("-"));
        String lowerCase = lastName.toUpperCase();
*/


    }
}




/*
Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */