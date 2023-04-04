package java_programming.day06_ifStatements;

public class SingleIfStatementPractice {


    public static void main(String[] args) {

        int number = 155;
        boolean isEven = number % 2 == 0;

        if (isEven){
            System.out.println("Even number");
        }

        if (!isEven){  // not operation kullaniyoruz burada cift sayinin tersi

            System.out.println("Odd numbers");
        }


    }
}
