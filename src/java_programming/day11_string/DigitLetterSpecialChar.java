package java_programming.day11_string;
import java.util.Scanner;
public class DigitLetterSpecialChar {

    public static void main(String[] args) {


        // System.out.println("".charAt(0));

        String str = new Scanner(System.in).nextLine(); // eger bir kereden fazla  kullanmicaksak scanneri, busekilde yazabiliriz ve close yapmamiza gerek kalmaz!!

        if(str.length() >= 1){ // if the string has at least one character--->cümlede toplam harf, bosluk,karakter sayisina bakiyoruz buyüzden burda toplam 1 tane var

            char f = str.charAt(0); //the first character of string----> burda index her zaman 0'dan baslar.


            if(f >= '0' && f <= '9'){ // ascii'de 'f' karakterinin karsiligina bakiyoruz ---> '0' bu karakter degil digit olarak geciyor
                System.out.println("first character is digit");

            }else if( f >= 'A' && f <= 'Z'){ // eger f 'A'büyük harfden 'Z' kontrol ediyoruz ---> ascii'den bunlarin rakamlarinida yazabiliriz
                System.out.println("first character is uppercase letter");

            }else if( f >= 'a' && f <= 'z'){
                System.out.println("first character is lowercase letter");


            }else{
                System.out.println("first character is special character");
            }


            }else{ // if string is empty
            System.out.println("String is empty");
            }







    }
}
