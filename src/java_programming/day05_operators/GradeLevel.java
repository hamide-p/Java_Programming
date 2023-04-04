package java_programming.day05_operators;

public class GradeLevel {


    public static void main(String[] args) {

        int gradeLevel = 2;  // if the school grade level is 2 then it will show the Elementary school --->> eger atadigimiz sinif sayisi yazdigimiz if print statements'e uyuyosa ozaman hangi sinif oldugunu gösteriyor outputta--->> gradelevel 1'den büyük ya da esitse ve 5'den kucuk ya da esitse o zaman ilkögretim olarak görünür outputta.

        if (gradeLevel >= 1 && gradeLevel <= 5){
            System.out.println("Elementary School");
        }

        if (gradeLevel >=6 && gradeLevel <=8){
            System.out.println("Middle School");
        }

        if (gradeLevel >=9 && gradeLevel <=12){
            System.out.println("High School");
        }


        if (gradeLevel >=13 && gradeLevel <=16){
            System.out.println("College");
        }



        if (gradeLevel >=17 && gradeLevel <=18){
            System.out.println("Grad School");
        }





    }
}

/*

1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write
a program to determine and print which school type someone is in
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
Assume that the given number is 1 ~ 18

 */