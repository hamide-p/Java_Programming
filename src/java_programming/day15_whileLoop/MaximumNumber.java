package java_programming.day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648; // the min number of the integer-->any integer number is going to be greater than this number--> burada 0 kullanirsak ve eksi sayi (-10) girmek istedigimizde bug olusur.



        for(int i = 0; i< 5; i++){ // o dan baslayinca 4e kadar gelince 5 kere kullanmis oluyoruz oyüzden = 5 yapmiyoruz --> 5 kere numarayi yazdirmak istiyoruz --> i = 0,1,2,3,4
            System.out.println("Enter a number ");
            int num = input.nextInt(); // 10, 5 , 3 , 20 , 15



            if(num > max){ // if the user entered entry is greater than the current maximum number that we have
                max = num; // then user entered number should be the max. number
            }
            
        }


        System.out.println("maximum number is: " + max);
        input.close();


    }
}
/*
1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number
 */