package java_programming.day22_ArrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {


      /*
       One important difference between parseDouble() and valueOf() is their return type. parseDouble() returns a primitive double, whereas valueOf() returns a Double object. This means that parseDouble() is generally faster and more memory-efficient than valueOf(), but valueOf() can be useful when you need to work with objects rather than primitive types.
      * */


        String str = "20";


        System.out.println(str + 1);


      //  Integer num1 = Integer.parseInt(str); // unboxing


        int num = Integer.parseInt(str);

        System.out.println(num +1);




        Integer num2 = Integer.valueOf(str);

        System.out.println(num2);


        System.out.println("........................");

        String s = "20.5";

         double num3 = Double.parseDouble(s);

        System.out.println(num3);

        Double num4 = Double.valueOf(s);

        System.out.println(num3);

        System.out.println("...................");

        String x = "true";
       boolean r1 = Boolean.parseBoolean(x);

      Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("....................");

        char ch = '1';

       boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isLowerCaseLetter = Character.isLowerCase(ch);
        boolean isUpperCaseLetter = Character.isUpperCase(ch);
        boolean isSpecialChar = !Character.isLetterOrDigit(ch); // special character--not digit nor letter




        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);
        System.out.println("isSpecialChar = " + isSpecialChar);


        System.out.println("........................");


        String string = "a1b2c3d4e5";

        int sum = 0;

        string.toCharArray();







    }
}
