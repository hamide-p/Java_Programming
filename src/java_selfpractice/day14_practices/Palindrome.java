package java_selfpractice.day14_practices;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);

        System.out.println("Enter a palindrome word");

        String str = input.next();

        String result = "";

        input.close();

        for(int i = str.length()-1 ; i >= 0; i --){
            result += str.charAt(i);
        }


        boolean isPalindrome = str.equalsIgnoreCase(result);

        System.out.println(isPalindrome);


    }
}
/*
Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true

 */