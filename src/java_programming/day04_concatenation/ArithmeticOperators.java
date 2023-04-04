package java_programming.day04_concatenation;

public class ArithmeticOperators {

    public static void main(String[] args) {


        System.out.println( 100 + 200);

        System.out.println(40 - 10);

        System.out.println(50 / 6); //in java it doesnt' give decimal result

        System.out.println(50 / 6.0); // if u want decimal result then u can use this way int / double

        System.out.println(50.0 / 6); // double / int ---> double

        System.out.println(50d /6); // 50 converted as double

        System.out.println( (int) (2.5 / 0.5) ); // convert the result to an integer and you can cast it then first you should put paranthesis This is calculated first.


        // System.out.println( 9 / 0 );in math the dominators can't be "0"



        System.out.println( 20 * 12 );


        System.out.println(100 % 13);

        System.out.println(45 % 8);






    }


}


/*
  Concatenation: +
        "text" + "text"
        "text" + Any Data
        any data + "text


  Addition: +
        number + number

   Division in math:

    20 / 6 = 3.3333...

    9 / 0

    in java:

    20 / 6 = 3

    int / int ------> int value

    int / double
    20 / 6.0 ------> 3.3333...

    int / int -----> int
    int / double -----> double
    double / int ----double
    double / double ---> double

Remainder: numerator - (denominator * integer result) finding the number of the remainder in math

      10 / 3 = 3.3...

      remainder: 10 - (3 *3) = 1

      20 / 6 = 3.333..
      20 - (6 * 3) = 2 // remainder of 20 / 6 artakalan sayiyi buluyoruz

      15 / 4 = 3.75
      15 - (4 * 3 ) = 3

      10 % 3 ----> 1  // the short of remainder

      20 % 6 ---->2
      15 % 4 ------> 3

 */


