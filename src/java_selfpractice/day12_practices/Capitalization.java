package java_selfpractice.day12_practices;

public class Capitalization {


    public static void main(String[] args) {


        capitalization("cyDeO", "sCHooL");




    }

public static void capitalization(String firstName, String lastName){





    String firstNameUpper =  firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();


    String lastNameUpper = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();


    String fullName = firstNameUpper + " " + lastNameUpper;

    System.out.println("fullName = " + fullName);



}



}
 /*

Create a method named capitalization that can format the first and last names of the person and display the full name of the person


    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School


  */