package java_programming.day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            if (i == 2) {
                continue; // to skip the current iteration
            }

            System.out.println(i);
        }


        System.out.println("-------------------------------------------");


        for (int i = 10; i < 21; i++) {

            if (i % 2 == 0) { // if i is even
                continue; // skips the current iteration
            }

            System.out.println(i);
        }

        System.out.println("-------------------------------------------");



        for (char i = 'A'; i <= 'G'; i++) { // i: A, B, C, D, E, F, G

            if (i == 'B' || i == 'E') { // if you don't want to exit use continue
                continue;
            }

            System.out.println(i);

        }

        System.out.println("--------------------------------------------");

/*
        for (int i = 0; i < 10; i ++) {
            System.out.println("Hello World");
        }

*/









    }
}
