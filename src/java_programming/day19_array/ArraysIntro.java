package java_programming.day19_array;
import java.util.Arrays;
public class ArraysIntro {


    public static void main(String[] args) {


        //  int score1 = 85, 75 -> u can't give more than one variable--> it gives compile error

        int score1 = 85;
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;


        System.out.println("...................");

        // double [] scores = new double[5]; --> [0.0, 0.0, 0.0, 0.0, 0.0] index
        // String [] scores = new String[5]; ---> [null, null, null, null, null]
        int [] scores = new int[5]; // 0 ~ 4 index number of 5 in this array
        // -- eligible for garbage collector

        scores[2] = 78;
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 88;
        scores[4] = 95;

     //   scores[5] = 100; //--> u can't use index 5 it's ArrayIndexOutOfBoundsException

     //   scores[-1] = 65; // ArrayIndexOutOfBoundsException


    //    scores = new int[10]; // index 0 ~ 9 -- eligible for garbage collector

   //     scores = new int[50]; // index 0 ~ 49 not eligible for garbage collector cause the older variables are eligible for garbage collector

        System.out.println( Arrays.toString(scores) );

        System.out.println(scores[2]);

        System.out.println(".............................");


        for (int i = 0; i < scores.length; i++) { // i : index numbers of scores
            System.out.println(scores[i] );
        }

        System.out.println("...............");

        System.out.println(scores[scores.length-1] );



        








    }



}
