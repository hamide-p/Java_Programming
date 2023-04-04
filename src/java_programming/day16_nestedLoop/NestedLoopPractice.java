package java_programming.day16_nestedLoop;

public class NestedLoopPractice {


    public static void main(String[] args) {


        String str = "aaabbccccddeeeeff";

        String result = "";  // "bdf"

        for (int j = 0; j < str.length(); j++) { // nested loop --we give different initialization name 'j' here instead of 'i'

            char ch = str.charAt(j); // find the each character of str  instead of using '0' -- represents the character

            int count = 0; // represents the frequency

            for (int i = 0; i < str.length(); i++) { // first character frequency-- responsible for comparing ch to each character of str and return the frequency of ch

                if(str.charAt(i) == ch){
                    count++;
                }
            }

            if(count == 2 && !result.contains(""+ch)){
                result += ch;
            }

        }


        System.out.println(result);




    }


}

        
        
        
        






