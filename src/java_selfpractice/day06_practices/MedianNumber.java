package java_selfpractice.day06_practices;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        if((a>b && b<c) || (a>c && a<b)){
            System.out.println(a+" is median number");
        } else if((b > a && b < c) || (b > c && b < a)){
            System.out.println(b + " is median number");
        } else{
            System.out.println(c+" is median number");
        }
    }
}

        /*
        int a = 10,
                b= 15,
                c = 20;
        String result = "";

        // a = 10 b = 15 c =20


        if ((a>b && b<c) || (a>c && a<b)){

         result = "";
        }

        if ((b>a && b<c) || (b>c && b<a)){

            result = "";
        }

        if ((c>a && c<b) || (c>b && c<a)){

            result = "";
        }


        System.out.println(result + " is the median number");



 }
}
        //  Wenn a > b und b > c, dann weißt du schon mal, dass `b` der Median ist.




/*
1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */