package day03_variables;

import javax.xml.crypto.Data;

public class PrimitiveDataTypesIntro2 {

    public static void main(String[] args) {

        //Datatype variableName = Data;

        char a = '@';
        char b = '!';
       // char ab ='ab'; // it only accepts a single character thats why it gives compile error

        System.out.println(a);
        System.out.println(b);

        System.out.println("...........................");

        char ch1 = 'A';
        char ch2 = 65;
        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("............................");

        char ch3 = 40000;
        System.out.println(ch3);

        System.out.println("............................");

        int sum = 'A' + 'B';

        // Ascii table A (65) + B (66) =131
        System.out.println(sum);


        System.out.println("............................");

       // char ch4 = -100;


       // boolean r1 = 123; // not for int numbers

        //boolean r2 = 2,5;
        //boolean r3 ="Java";

       boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 10;  //true
        boolean r7 = 0 < -1; // false

        System.out.println(r6);
        System.out.println(r7);





    }

}
