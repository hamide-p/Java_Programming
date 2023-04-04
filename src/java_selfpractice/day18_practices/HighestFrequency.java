package java_selfpractice.day18_practices;

public class HighestFrequency {

/*
    1. Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e
*/



    public static void main(String[] args) {

        String str = "aaabbccccddeeee";
        String result ="";
        int highestFrequency = 0;


        for (int i = 0; i < str.length(); i++) {
          char ch = str.charAt(i);
          int frequency =0;


            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    frequency++;
                }
            }

            if (frequency > highestFrequency) {
                highestFrequency = frequency;
            }

        }








}
}








