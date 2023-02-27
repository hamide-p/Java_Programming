package day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 1000;
        int b = 200;

     //    System.out.println( a > b );

        boolean aIsGreater = a > b ;

        System.out.println(aIsGreater);

        System.out.println("...................");

        int score = 75;

        boolean passed = score >= 60;
        System.out.println(passed);


        System.out.println("..................");

        int age = 21;

        boolean eligibleToBuyAlcohol = age >= 21;

        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote = age >= 18;

        System.out.println(eligibleToVote);

        System.out.println("..............");


        System.out.println( 100 > 100); // false-->100 is not bigger than 100

        System.out.println(100 >= 100); // true 100 is equal 100

        System.out.println( 100 >= 85); // true

        System.out.println("...............");

         score = 48;

         boolean failed = score < 60;
        System.out.println(failed);  // true 48 less than 60 --> failed

        System.out.println("...............");

        System.out.println( 100 < 2000); //true

        System.out.println( 100 < 20); //false

        System.out.println( 95 <=100); // true---> only one condition will be true

        System.out.println(100 <=100); // true


        System.out.println( 10 <= 5); // false

        System.out.println("...............");

       // System.out.println("Java" <= "C#"); --> compile errors because its not numbers

        System.out.println( 'a' > 'b'); // ascii table have number for a and b a= 65 b= 66   65>66  ---->false  we use here 'char'


    }
}
