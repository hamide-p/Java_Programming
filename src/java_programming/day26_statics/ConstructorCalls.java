package java_programming.day26_statics;

public class ConstructorCalls {

    public static void main(String[] args) {

        method1();
        System.out.println("....");

        method2();
    }


/*
  * constructor can be overloaded with the same name & classes but different parameters
  * constructors can't be called by its name, instead this() method must be used
  * this. : to call instance variables & instance methods
  * this(): used for calling constructors in another constructor.This allow us to reuse code and reduce duplication.
  * only a constructor can call another constructor
  * constructor call MUST be at the first step because the object needs to be initialized before any other code can be executed.
  * one constructor can not call more than one constructor. There is a limitation.
  * constructor can not call or contain itself as this would result in an infinite loop.
 */


    public ConstructorCalls(){
       // this(); --> constructor can not call or contain itself
        System.out.println("Default constructor");
    }

    public ConstructorCalls(int a){
        // ConstructorCalls(); --> compile error --> we can't call method like this as the regular methods
        System.out.println("Constructor with int argument");
       // this(); --> constructor call has to be at the first step
    }


    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }


    public ConstructorCalls(String c){

      this(2.5); // --> there is a limit by calling constructor
       // this(); // default argument -- should choose one of them

        System.out.println("Constructor with String argument");
    }


    /*
       for regular methods:
    *  they can call each other by their method names
    *  this. : to call instance variables & instance methods
    *  methods can be before or after the print statement
    *  method can call or contain itself
     */

    public static void method1(){
        System.out.println("Method 1");
    }

    public static void method2(){
        method1();
        System.out.println("Method 2");
      //  method2();
    }



}
