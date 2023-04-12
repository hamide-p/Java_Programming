package java_programming.day25_constructor;

public class ConstructorIntro {


    // in one class you can't have multiple same methods with the same parameters, if you have multiple methods in the same class with the same name, then it has to be overloaded.Plus, any method can be overloaded.
    public ConstructorIntro(){
    System.out.println("Object is create using no argument constructor");
    }


    public ConstructorIntro(int a){
        System.out.println("Object is create using int argument");
    }


     //regular method
    //    must  optional must  must
          public static void add(){

    }

    public static void main(String[] args) {


       /*
       * constructor doesn't have any return type
       * multiple objects can  be created from a class, each object has a different memory
        */
      ConstructorIntro obj1 = new ConstructorIntro(10);
      ConstructorIntro obj2 = new ConstructorIntro();
     // ConstructorIntro obj3 = new ConstructorIntro("Java"); --> compile error- we haven't made a constructor with string







    }
}
