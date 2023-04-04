package java_programming.day17_customClass;

  /*
    Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
     */

public class UniqueCharacters2 {

    public static void main(String[] args) {


        String str = "aabcccd";

        String unique = "";


        for (int j = 0; j < str.length(); j++) { // find the frequency of each character from the string

            char ch = str.charAt(j); // first getting the first character --> 'a'
            int frequency = 0;


            for (int i = 0; i < str.length(); i++) { // if the ch has appeared in the string
                if (str.charAt(i) == ch) {
                    frequency++; // increase the frequency by 1
                }
            }

            if (frequency == 1) { // if the frequency is equal to 1, then it's unique ---> cause it's only one time has appeared in the string
                unique += ch;
            }
        }


            System.out.println(unique);






            /*
           -  we create first 'i' loop to find the first character's frequency

           -  then we find the unique character of it

           -  then we want to know also the rest of the characters frequency and unique characters

           -  then we create 'j' loop and then add 'i' loop into the 'j' loop.




             */














    }

}
