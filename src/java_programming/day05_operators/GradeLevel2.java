package java_programming.day05_operators;

public class GradeLevel2 {

    public static void main(String[] args) {

        int gradeLevel = 2;

        String result = "" ; // temporary value

        if (gradeLevel >= 1 && gradeLevel <= 5){
            result = "Elemantary School";  // we don't use the "print statements" here we just used the "result" variables which is "empty string" because we can assign later the grade level there
        }

        if (gradeLevel >= 6 && gradeLevel <= 8){
            result = "Middle School";
        }

        if (gradeLevel >= 9 && gradeLevel <= 12){
            result = "High School";
        }

        if (gradeLevel >= 13 && gradeLevel <= 16){
          result = "College";
        }

        if (gradeLevel >= 17 && gradeLevel <= 18){
            result = "Grad School";
        }

        System.out.println(result);

    }
}
