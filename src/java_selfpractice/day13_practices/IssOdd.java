package java_selfpractice.day13_practices;

public class IssOdd {

    public static void main(String[] args) {


        System.out.println(isOdd(8));


    }


    public static boolean isOdd (int num){

        if ( num % 2 != 0 ){
          return true;
        }
        return false;
    }

}


/*
 Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false
 */