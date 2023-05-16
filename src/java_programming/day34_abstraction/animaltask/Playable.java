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


}
