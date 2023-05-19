package java_programming.day34_abstraction.animaltask;

public interface Playable {

    public boolean isFriendly = true; // static & final by default
    // boolean isFriendly; we can't use instance variable
    // public  boolean isFriendly = true; // Modifier 'public' is redundant for interface members


    /*
    private static void main(String[] args) {

        System.out.println(isFriendly);

       // isFriendly = false;
    }

    default void method1(){

    }
    */

    void play(); // abstract
    // public abstract  void play(); // public and abstract are optional to use




    /*
    Notes & Methods From Daily Class:

    boolean playable = true; // final & static & public !! by default & mandatory

    void play(); // abstract & public by default

    static void playBall() { // static method --> public by default, and we can make it private as well.
        System.out.println("is playing ball");
    }

    default void playToy() { // in order to have and inherit instance method --> it's public default and no chance to make it private like static methods.
        System.out.println("Playing Toy");
    }*/

}
