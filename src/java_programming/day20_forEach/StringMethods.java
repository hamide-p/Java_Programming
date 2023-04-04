package java_programming.day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {


    public static void main(String[] args) {

 /*
  toCharArray method : when you call it you don't  need to pass any argument. It returns charArray by including  each character of the string


  split method: when you call it you have to give an argument and returns stringArray. it gives each of the words from a sentence
  */
        String str = "Cydeo School";

        char[] ch = str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch));


        System.out.println("......................");

        String str2 = "Today is a great day to learn java";


        String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));


        String sentence = " I love Java";

       String[] arr =  ArraysUtility.reverse(sentence.split(" "));
        // "Java love I


        System.out.println(Arrays.toString(arr));


        System.out.println("..................");

        String reversedsentence = "";// "Java love I"

        for (int i = 0; i < arr.length; i++) {
            reversedsentence += arr[i] + " ";
        }


        System.out.println(reversedsentence);


    }
}
