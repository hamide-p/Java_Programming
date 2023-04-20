package java_programming.day27_accessModifiers;

import java.lang.reflect.Constructor;

public class StaticBlock_vsInstanceBlock_vs_Constructor {

    /*

       Constructor:
      • is called when an object is created
      • does take arguments , when we want to set the values of instance variables, we can use constructors.
      • execution always depend on the object
      • is used for object initialization

       Instance Block :
      • is executed every time an instance of the class is created.
      • doesn't take arguments , we set the known data to the instance variables if we want to use the instance block
      • execution always depend on the object
      • is used for instance initialization

       Static Block :
      • is called when an object is created
      • doesn't take arguments , we set the known data to the static variables if we want to use the static block
      • doesn't get executed more than ONCE!!
      • execution doesn't depend on the object
      • is used for static initialization

        */


    public StaticBlock_vsInstanceBlock_vs_Constructor() {
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block");
    }

    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");


        new StaticBlock_vsInstanceBlock_vs_Constructor(); // Static Block /  Main Method /   Instance Block /    Constructor

        new StaticBlock_vsInstanceBlock_vs_Constructor(); // Static Block /  Main Method /   Instance Block /    Constructor / Instance Block /    Constructor


    }
}
