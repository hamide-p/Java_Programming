package java_programming.day24_dateAndTime;

import java_programming.day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementsFromCollection {

    public static void main(String[] args) {

        /*
        Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
         */


        ArrayList<Integer> list = new ArrayList<>(); // 0 ~ 13

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));



        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 4){
                list.remove(i); // 0 ~ 9
            }
        }

        System.out.println(list);

        /*
        The size of ArrayList is dynamic and when we remove elements it'll be shifted to left. Even if this solution above is correct to use, the result (index) will be changed as 9 --> [2, 4, 5, 6, 7, 2, 4, 5, 6, 7]. This method will not remove properly all the less numbers from 4.
                -->  So DON'T USE remove() method in loop <---
       */


        /*
        So we use here Iterable method. This is what every single collection needs to be iterable in order to remove all the element during the iteration in the loop.
         */

        System.out.println("\n..............................");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));


        /*
       In removeAll() method;
       *  you have to specify the elements that you want to remove
       * in this scenario element could be 3, 2, 1,0, -1, -2 ...
       * if the elements are unknown don't use removeAll() method

       In removeIf() method;
       * if the elements are known then you can use removeIf() method
       * using iterable implicitly there is a method called removeIf() method

       */




        list2.removeIf( p -> p < 4 ); // first give a variable name preferred 'p' then give a condition which is you want to remove elements less than 4

        System.out.println(list2); // [4, 5, 6, 7, 4, 5, 6, 7]


        System.out.println("\n..............................");


        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Java", "Python", "C#","Java", "Ruby", ""));


        names.removeIf( p -> p.startsWith("J") ); // condition is if elements start with "J" then remove all

        System.out.println("names = " + names);


        System.out.println("\n..............................");


        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");


        employees.removeIf( p -> p.salary > 100000 ); // p represents each employee objects

        for (Employee each : employees) {
            System.out.println(each.name + " : "+each.salary);
        }

    }
}
