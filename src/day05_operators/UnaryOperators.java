package day05_operators;

public class UnaryOperators {


    public static void main(String[] args) {

        // pre increment/decrement

        int x = 10;

        System.out.println( ++x ); // it changes the value immediately

        System.out.println(x); //11 because we change the value above "+1" thats why the result will be 11 again

        int y = 100;

        System.out.println( --y ); // 99
        System.out.println(y); // 99 ---> it changes according the value above that we applied

        System.out.println("...............");

        // post increment/decrement

        int a = 50;

        System.out.println( a++ ); // 50 seen on the console ---> post increment not change immediately

        System.out.println(a); // 51 ---> now its changed adding by 1

        int b = 25;

        System.out.println( b--); // 25
        System.out.println(b); //24



        int n = 30;
        int m = n++; // m = 30,  n=31

        System.out.println("n = " + n);
        System.out.println("m = " + m);

        int z = 60;
        int q = z-- ; // q= 60 its used correct and old value first, it doesnt change immediately thats why its 60 now ----- after passing the old value its going to used decrease the value by 1. --> z = 59 eventually decreased

        System.out.println("z = " + z);
        System.out.println("q = " + q);










    }
}
