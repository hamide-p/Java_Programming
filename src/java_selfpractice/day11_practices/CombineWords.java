package java_selfpractice.day11_practices;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first words");
        String first = input.next();

        System.out.println("Enter second word");
        String second = input.next();

        input.close();

              if (first.charAt (first.length()-1) == second.charAt(0)){

                  System.out.println(first + second.substring(1));

              }else{
                  System.out.println(first + second);
              }


    }
}
/*
Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
 */