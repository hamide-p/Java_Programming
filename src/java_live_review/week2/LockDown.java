package java_live_review.week2;

public class LockDown {
    /*
    Lockdown [if else]

	Declare and assign a year variable

	Using the year determine if we were on lockdown and we did on a daily basis

		if the year was 2020 or 2021 print:
			Stay at home
			Practice java
			Wear a mask

		if the year was any other year print:
			Party
			Practice Java
			Travel
     */

    public static void main(String[] args) {

        int year = 2023;

        if (year ==2020 || year == 2021){  // false || false // alternative: if (year >= 2020 && year <=2021)
            System.out.println("Stay at home\nPractice Java\nWear a mask");
        }else {
            System.out.println("Party\nPractice Java\nTravel");
        }

    }
}
