package java_programming.day31_inheritance;

class A {
    //it's only between parent child class


    public int a = 100;

}

public class FieldHiding extends A {


    public int a = 300; // the parent class has the same field name as an instance variable in a child class, it will hide the variable in the parent class. It will NOT be inherited by the child class.

    public static void main(String[] args) {


        System.out.println(new FieldHiding().a);
    }

}