package java_programming.day12_customMethodsIntro;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = input.nextLine().trim().replace(" ", "");
        // trim(0 & replace() methods will make sure that the white spaces & additionals spaces between the characters will be removed ---> trim burada bos olan yerin yerine" " --- "" boslugu kaldiriyoruz

        System.out.println("Enter your last name:");
        String lastName = input.nextLine().trim().replace(" ", "");

        input.close();

        firstName =  firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();


        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();


        String fullName = firstName + " " + lastName;

        System.out.println(fullName);




    }
}
 /*
 Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School

  */