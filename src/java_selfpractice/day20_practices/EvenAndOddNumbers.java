package java_selfpractice.day20_practices;

import java.util.Arrays;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
         /*
         Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
          */


        int[] numbers = {27, 11, 3, 16, 4, 34, 1, 2, 35};

        int odd =0,
            even =0;
        String evenNum ="",
                oddNum = "";

        for (int each : numbers) {

            if (each % 2 == 0) {
                even++;
                evenNum += numbers;
            }else{
                odd++;
                oddNum += numbers;
            }
        }

        System.out.println(Arrays.toString(numbers) +" has "+even+" even numbers "+ odd+" odd numbers");







    }
}

