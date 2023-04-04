package java_selfpractice.day19_practices;

import java.util.Arrays;

public class ClassmatesInitials {

/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmate's in separate lines


 */
    public static void main(String[] args) {


        String[] classmates = {"Safiye Mertcan", "Gülnaz Baycan", "Merve Yüksel", "Shokhida Mirzayeva", "Sevilay Unlu", "Cigdem Esmer", "Ibrahim Akay", "Ismail Duman", "Ömer Dalkiran", "Ali Camoglu" };


        for (int i = 0; i < classmates.length; i++) {

            String initials = classmates[i].charAt(0) + "." + classmates[i].charAt(classmates[i].indexOf(" ") + 1);
            System.out.println(initials);
        }







    }
}
