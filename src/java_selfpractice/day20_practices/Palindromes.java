package java_selfpractice.day20_practices;

public class Palindromes {
    public static void main(String[] args) {

      /*
      write a program that can count how many palindromes in an array of string
        Ex:
        {"anna", "level", "Java"};

        output:
        2
        */


        String[] str = {"anna", "level", "Java"};

        int countPalindrome = 0;


        for (String each : str) { // we get all the names from for each loop


            String reverse ="";
            for (int i = each.length()- 1; i >= 0; i--) {
                reverse +=each.charAt(i); // we get all each character backwards and add to the reversed string
            }

            if(each.equalsIgnoreCase(reverse)){
                countPalindrome++; // if each name is equal to reversed character then add to the countPalindrome variable -->  each:anna == reversed:a n n a = 1 palindrome
            }
        }

        System.out.println("Number of palindrome in the elements: " + countPalindrome);


    }
}
