package java_selfpractice.day22_practices;

public class RetrieveLetters {
    public static void main(String[] args) {



        /*
        Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

         */


        String str = "Wooden Spoon!";

        String letters = "";
        int digits = 0;
        String specialChars = " !";



        for (char each : str.toCharArray() ){

            if(Character.isLetter(each)){
                letters += each;
            }else if(Character.isDigit(each)){
                digits += each;
            }else{
                specialChars += each;
            }
        }



        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);



    }
}
