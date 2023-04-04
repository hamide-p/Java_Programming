package java_selfpractice.day09_practices;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate:");
        double hourlyRate = input.nextDouble();

        System.out.println("how many hours do you work in a week?");
        int weeklyHours = input.nextInt();

        System.out.println("Enter state tax (in percentage)");
        double stateTaxRate = input.nextDouble();


        System.out.println("Enter federal tax (in percentage)");
        double federalTaxRate = input.nextDouble();



        double salaryBeforeTax = hourlyRate * weeklyHours * 52 ;

        double stateTax = salaryBeforeTax * stateTaxRate / 100 ;

        double federalTax = salaryBeforeTax * federalTaxRate / 100;

        double totalTax = stateTax + federalTax;

        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Salary is: $" + salaryBeforeTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);

        input.close();
    }
}
 /*
 Create a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
  */