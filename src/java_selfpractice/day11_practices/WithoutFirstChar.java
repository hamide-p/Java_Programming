package java_selfpractice.day11_practices;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first words");
        String first = input.next();

        System.out.println("Enter second word");
        String second = input.next();

        input.close();


        String firstWord = first.substring(1);

        String secondWord = second.substring(1);

        String result =firstWord + secondWord;
                System.out.println(result);

        input.close();



    }
}
/*
Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana



                 String result = first.substring(1) + second.substring(1);
 */