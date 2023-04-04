package java_selfpractice.day19_practices;

import java.util.Arrays;

public class ClassmatesReverse {
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c

 */
    public static void main(String[] args) {




            String[] classmates = {"Safiye", "Gülnaz", "Merve", "Shokhida", "Sevilay", "Cigdem", "Ibrahim", "Ismail", "Ömer", "Ali" };


        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverse = "";

            for (int j = name.length()-1; j >= 0; j--) {

                reverse += name.charAt(j);
            }

            System.out.println(reverse);

        }





    }
}
