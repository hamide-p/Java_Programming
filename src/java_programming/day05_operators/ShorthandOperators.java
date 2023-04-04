package java_programming.day05_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        int a = 20;

        System.out.println( a ); // 20

        System.out.println( a ); //20

        a = 40;

        System.out.println( a );

        a = 90;

        System.out.println( a );

        System.out.println("..........");

        double balance =100; // bankadaki bakiye balance from your bank account, eger bankaya depozito eklemek istersen +1000$ addition assignment kullaniyoruz

        balance += 1000; // balance = 100 +1000

        System.out.println("balance = " + balance);
        
        balance += 500; // balance = 1100 + 500

        System.out.println("balance = " + balance);
        
        balance += 10_000;

        System.out.println("balance = " + balance);
        
        balance -= 1000; // balance = 11600 - 1000

        System.out.println("balance = " + balance);
        
        balance -= 5000;

        System.out.println("balance = " + balance);

        System.out.println("...............");

        double salary = 45000;
        salary *= 2; // salary = 45000 * 2
        System.out.println("salary = " + salary);
        salary *= 3;
        System.out.println("salary = " + salary);

        System.out.println("..............");

        double eth = 4;  // kripto para ethriam
        
        eth *= 250;

        System.out.println("eth = " + eth);
        
        eth /= 2; // eger kripto para 50% düstüyse bunu bulmak icin 2 ye bölüyoruz.
        System.out.println("eth = " + eth);

        System.out.println("...........");

        System.out.println("salary = " + salary);

        salary /= 2; // division assignment operator

        System.out.println("salary = " + salary);

        









    }
}
