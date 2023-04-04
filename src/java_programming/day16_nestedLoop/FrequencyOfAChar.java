package java_programming.day16_nestedLoop;

public class FrequencyOfAChar {


    /*
    write a program that can return the frequency of a character from a string
                Ex:
                    str = "aaabbbbccccc"
                    ch = 'c'

                 output:
                     5
     */
    public static void main(String[] args) {

        String str = "aabbccccc";
        char ch = 'c';
        int count = 0;


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch) {
                ; // if the character of the string is equal to the given character, it means the given character has appeared in the string
                count++; //than we add it to the count variable cause we need to find out how many times it has been used
            }
        }
        System.out.println("The frequency of " + ch + " is: " + count);




    }
}
