package java_selfpractice.day25_practices.SalaryCalculator;

public class SalaryCalculator {




    /*
    Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
     */



    double hourlyRate,
            stateTaxRate,
            federalTaxRate;
    int weeklyHours;



    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate /100; // to make sure that user does not need to convert the percentage to decimal
        this.federalTaxRate = federalTaxRate /100; // to make sure that user does not need to convert the percentage to decimal
        this.weeklyHours = weeklyHours;
    }



    public double salary(){
     return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return salary() * stateTaxRate ;
    }



    public double federalTax(){
        return salary() * federalTaxRate ;
    }


    public double salaryAfterTax(){
        return salary() -  federalTax() - stateTax()  ;
    }



    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                ", hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }




}
