package java_programming.day05_operators;

public class LogicalOperators {


    public static void main(String[] args) {

        // && both condition has to be true

        double salary = 60000;
        int creditScore = 650;
        int age = 25;

        boolean eligibleForLoan = salary >= 30000 && creditScore >=650 && age >= 18;

        System.out.println(eligibleForLoan);


        System.out.println(".............");

        age = 18;
        String country = "USA";

        boolean eligibleToVote = age >=18 && country == "USA";

        System.out.println(eligibleToVote);

        System.out.println("...........");

        String answer = "maybe";

       // boolean validAnswer = answer == "yes" && answer == "no"; // answer can't be either yes or no it should be one answer then we cant use "&&"

        boolean validAnswer = answer == "yes" || answer == "no";

        System.out.println(validAnswer);

        System.out.println(".................");

        char grade = 'B';

        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';
        System.out.println(passedTheExam);


        System.out.println(".............");

        System.out.println(!true); // Logical not operator -->not true means false

        String a = "yes";

        boolean yes = a == "yes"; // evaluated true

        boolean no = !yes; // false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println(".............");
        int score = 65;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("..............");

        System.out.println( true == !false && false == !true && true != !true);

                //           true               true             true (true dosnt equal to false




    }
}
