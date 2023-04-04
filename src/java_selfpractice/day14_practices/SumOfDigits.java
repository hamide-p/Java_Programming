package java_selfpractice.day14_practices;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {


        String word = "A1B2C3"; // a 65, b 66, c 67,
        int sum = 0;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (ch >= '0' && ch >= '9') {
                sum += ch - 48; // 48 os 0 in ascii table
            }
        }
        System.out.println("sum = " + sum);

    }
}
 /*
 Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
  */