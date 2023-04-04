package java_programming.day20_forEach;

import javax.swing.*;

public class ForEachLoop {
    public static void main(String[] args) {



    int[] numbers = {10, 20, 30, 40, 50};

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        System.out.println(".........................");


    for( int each : numbers ){
        System.out.print(each + " , ");
    }

    /*
           initialization runs from index 0
           access each element shortly
           iteration order is fixed
           number of iteration is also fixed
           there is no index any numbers
  */  // For each loop


    }
}
