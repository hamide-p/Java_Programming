package java_programming.day22_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list); // empty, size is zero

        list.add(10); // index 0 --> it is an ordered data structure
        list.add(20); // index 1
        list.add(30); // index 2
        list.add(10); // index 3 -->Array list accepts duplicates
      //  list.add(5.5);// double primitive can't convert into the integer object
        System.out.println(list);

        list.add(1,15); // shifts to the next index number (right by 1)

        System.out.println(list); // now we have [10, 15, 20, 30, 10] elements in the Array list

        list.add(2,25);

        System.out.println(list); // [10, 15, 25, 20, 30, 10]


        System.out.println(".................");

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Jane");
        studentsList.add("Oliver");
        studentsList.add("Zara");
        studentsList.add("Daniel");


        System.out.println(studentsList.size()); // 4
        System.out.println(studentsList); // [Jane, Oliver, Zara, Daniel]
        String firstStudent = studentsList.get(0);
       String lastStudent = studentsList.get(studentsList.size()-1); // last index number

        System.out.println(firstStudent); // Jane
        System.out.println(lastStudent); // Daniel




    }
}
