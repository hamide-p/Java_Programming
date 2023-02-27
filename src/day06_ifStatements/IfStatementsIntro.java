package day06_ifStatements;

public class IfStatementsIntro {

    public static void main(String[] args) {

        int number = - 100;

        boolean isPositive = number > 0; // only to be executed under the condition of only if positive, then only the number is greater than the 0

     if ( isPositive ) {
         System.out.println(number + " is positive");
        }    // if the statement is not positive, then it will not executed . If the statement is negativ, then it will executed in the console(burada sayi pozitif olmadigi icin konsolda görünmedi)


        boolean isNegativ = number < 0;

        if (isNegativ) {

            System.out.println(number + " is negative");
        }


        boolean isZero = number == 0;

        if (isZero) {

            System.out.println(number + " is zero");
        }




        System.out.println(".................");



        int num = 0;

        if ( num > 0){

            System.out.println(num + " is positive number");
        }

        if(num < 0){
            System.out.println(num + " is negativ number");
        }

        if (num == 0) {

            System.out.println(num + " is zero");
        }



    }
}
