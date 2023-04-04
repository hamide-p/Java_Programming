package java_programming.day18_garbageCollection;

import java_programming.day17_customClass.Dog;

public class GarbageCollection {

    public static void main(String[] args) {


        String s1 = "Java";
        s1 = null; // "Java " will be eligible for garbage collection

        System.out.println(s1);


        System.out.println(s1.toUpperCase()); // NullPointerException

        System.out.println(s1.replace(null, "Python")); // u have to remove the null firstly



        String a = ""; // it takes even memo in heap
        String b = null; // it doesn't take

        System.out.println(".....................");


        String str1 = "Python"; // it's collected by garbage collector
          str1 = "CYDEO";

        System.out.println(str1);


        System.out.println(".............");


        Dog dog1 = new Dog(); // we created method for using the same info to  another objects
        dog1.setInfo("Loki", "Husky", 'M', 3, "Medium", "Black");



        Dog dog2 = new Dog();
        dog2.setInfo("Chuck", "Bulldog", 'M', 5, "Small", "White");


       // dog1 = null;

        dog1 = dog2;

        System.out.println(dog1);
        System.out.println(dog2);



       // new Dog().finalize();




    }
}
