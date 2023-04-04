package java_selfpractice.day15_practices;

import java.util.Scanner;

public class MarriageProposal {

    /*
     Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no


     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String yesOrNo = input.next().toLowerCase();


        while (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))) {
            System.err.println("Invalid Entry! Please re-enter");
            yesOrNo = input.next().toLowerCase();
        }


            if (yesOrNo.equals("yes")) {
                System.out.println("Congrats");
            } else {
                System.out.println("Goodbye");
            }
            input.close();


    }


    }

