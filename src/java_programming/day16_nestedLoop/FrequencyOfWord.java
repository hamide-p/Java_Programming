package java_programming.day16_nestedLoop;

public class FrequencyOfWord {

    /*
    Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4
     */

    public static void main(String[] args) {


        String sentence = "java JAVA jAvA JAva";

        String word = "Java";

        int count =0;

        sentence = sentence.toLowerCase();

        word = word.toLowerCase();


        while(sentence.contains(word)){ // if the sentence contains java
            count++; // then we add to the count variable
           sentence = sentence.replaceFirst(word, ""); // we need to remove first java  in order to pass the next java
        }

        System.out.println(count);





    }
}
