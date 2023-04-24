package java_programming.day27_accessModifiers;

public class AccessModifiers {


    /*
     order of Access Modifier :
     Private ==>    Default ==>   Protected =>   Public
     more restrictive        ==>       less restrictive

     private ======> class
     default ======> class / package
     protected ======> class / package / subClass
     public  ======> class / package / subClass /  world

    • private: A private class, method or variable can only be accessed within the same class, but we can't access in different class even if it's subclass !! (However, getter/setter methods helps to access it)

    • default: A default class, method or variable can only be accessed within the same class and in the same package but different class. We don't have keyword for default access modifier

    • protected: A protected class, method or variable can only be accessed within the same class and in the same package but different class or  by a subclass in a different package

    • public: A public class, method or variable can be accessed from anywhere in the program

    • we can also use in constructor




    • */


    public static int publicDate = 200;

    protected static int protectedData = 300;

    static int DefaultDate = 400; // we don't have keyword for default access modifier. Default modifier comes default. So we don't need to write it.

    private static int privateData = 500;

    public AccessModifiers() { // we can also use in constructor
    }


    public static void publicMethod() {
        System.out.println("Public");
    }

    protected static void protectedMethod() {
        System.out.println("Protected");
    }

    static void defaultMethod() {
        System.out.println("Default");
    }


    private static void privateMethod() {
        System.out.println("Private");
    }


    public static void main(String[] args) {

        System.out.println(publicDate); // public is accessible within the same class

        System.out.println(protectedData); // protected is accessible within the same class

        System.out.println(DefaultDate); // default is accessible within the same class

        System.out.println(privateData); // private is accessible within the same class

        publicMethod(); // accessible within the ==> class / package / subClass /  world
        protectedMethod(); // accessible within the ==> class / package / subClass
        defaultMethod(); // accessible within the ==> class / package
        privateMethod(); // accessible within the ==> class


    }
}
