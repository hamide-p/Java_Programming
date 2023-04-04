package java_programming.day17_customClass;

public class UniqueCharacters {


    /*
    Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
     */


    public static void main(String[] args) {



        String str = "aabcccd";

        String unique = "";    // unique char. are non-repeating characters


        for (int i = 0; i < str.length(); i++) { // I: index numbers of str

            char each = str.charAt(i);

            if(str.indexOf(each) == str.lastIndexOf(each) ){ // first time and last time has appeared in the string --> b and d has only one time appeared
                unique += each;
            }

        }


        System.out.println(unique);



    }
}
