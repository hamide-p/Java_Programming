package java_selfpractice.day22_practices;

public class UppercaseAndLowercase {
    public static void main(String[] args) {




        /*
        Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

         */


        String str = "JAVA java";

        int lowercase = 0;
        int uppercase = 0;

        for (char each : str.toCharArray()) {

            if (Character.isLowerCase(each)){
                lowercase++;
            } else if (Character.isUpperCase(each)) {
                uppercase++;
            }else {
                continue;
            }
        }

        System.out.println("Total number of upper case  &  lower case are equal : " + (lowercase == uppercase));



    }
}
