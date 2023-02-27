package day03_variables;

public class PrimiteveDataTypesIntro {

    public static void main(String[] args) {

        //Datatype variableName = Data;

         // byte a = "Java";   // byte ONLY accepts integer values ( -128 ~ 127)
        // byte a = 20.5;  // byte can not take decimal numbers
       // byte a = 200;  // out of Byte's range ( -128 ~ 127)
        byte a = 20;

        // price of the car is $17500
        short p =  17500;

        System.out.println("p");     // just gives the "text" on console as a "p"
        System.out.println(p);       // gives the exact "value" that declared as a "price for $17500"

        // salary is $95000  // can't use as a byte and short

        int s = 95000; // preferred

        System.out.println(s);

        // int n = 9999999999;  // integer number is too large tu use int

        long n = 9999999999l;


        // gpa is 3,5

        double gpa = 3.5;  // prefferred of all the decimal numbers

        float gpa2 = 3.5f;




    }


}
