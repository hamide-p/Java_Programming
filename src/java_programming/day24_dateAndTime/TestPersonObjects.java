package java_programming.day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {




        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Daniel", 'M', LocalDate.of(1989,2,25));

        people[1].setInfo("Lina", 'F', LocalDate.of(1986,5,18));

        people[2].setInfo("Mila", 'F', LocalDate.of(1987,2,02));


        people[3].setInfo("Jacob", 'M', LocalDate.of(1964,11,23));


        people[4].setInfo("Junus", 'M', LocalDate.of(1988,02,01));



        ArrayList<Person> studentsList = new ArrayList<>();

        studentsList.addAll(Arrays.asList(people));


        // print name & date of birth of each person object
        for (Person eachPerson : studentsList) {

            System.out.println("Name: "  + eachPerson.name);
            System.out.println("Date of Birth: " + eachPerson.dateOfBirth );
            System.out.println();

        }

       // remove all the persons objects that has the age > 55
        boolean hasAge55 = studentsList.removeIf( p -> p.age > 55);
        System.out.println("hasAge55 = " + hasAge55);






    }
}
