package java_programming.day07_ifStatements;

public class MultiBranchIf {


    public static void main(String[] args) {

        int num = 100;

        String result = "";

        if (num > 100) {
          result = "Positive";
        } else if(num < 100) {
            result = "Negative";
        }else{
            result = "Zero";
        }

        System.out.println(result);







    }
}