package java_programming.day03_variables;

public class VariableNamingRules {


    public static void main(String[] args) {


        // age of the student is 28
        // the salary of the person is 10000

        int age = 28; // when u give    int x = 28; you cant understand what its for

        int salary = 10000;

        // int age = 32; // compile error because the age is already exits

        int phoneNumber = 123456789; // use CamelCase

        double salaryBeforeTax = 100000.5;

        double salary_after_tax$ = 800000.5;  // underscore and dollar is allowed to use

        System.out.println("..................................");

      //  int number = 10;
      //  int number = 20;
       // int number = 30; // must be unique name

        int number1 = 10;
        int number2 = 20;
        int number3 = 30; // must be unique name

      //  int 1number = 10;  // cant start with digits


         // double abstract = 5.5; // variable named can't be java reserved words

        // double final = 85.5; // final is a java reserved word (compile err)

        System.out.println("............................");

        // gender is male
        String gender = "Male";  // "Male " for multiple character usage --- 'M' for single character usage

        String fullName = "Cydeo School";

        System.out.println(gender);
        System.out.println(fullName);






    }

}
