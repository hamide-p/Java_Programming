package java_selfpractice.day11_practices;

import java.util.Scanner;

public class StarsWithX {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");

        String word = input.next();

        if (word.charAt(0)=='x'){
           word = word.replaceFirst("x", "a");
        }
        System.out.println(word);


        input.close();

    }
}
/*
Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */