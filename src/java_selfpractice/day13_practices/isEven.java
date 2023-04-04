package java_selfpractice.day13_practices;

public class isEven {

    public static void main(String[] args) {

        System.out.println(isEven(4));

    }

    public static boolean isEven(int num){

       if( num % 2 == 0){
           return true;
       }
       return false;
    }


    /*
    or this way;

    public static boolean isEven(int num){
            return !isOdd(num);

     */
}
/*
Create a method named isEven, that can return true if a number is an even number, otherwise returns false
 */