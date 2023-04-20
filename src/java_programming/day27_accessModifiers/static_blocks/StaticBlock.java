package java_programming.day27_accessModifiers.static_blocks;

public class StaticBlock {
   /*

    Static Block:
   • first all the static blocks get executed then main method
   • a static block is also called static initialization block
   • gets executed one time for all the objects
   • whenever you have static sets to be initialized use STATIC BLOCK
   • whenever you have instance variable to be initialized use CONSTRUCTOR

    static{
        System.out.println("Static Block");
    }
    */


    public static void main(String[] args) {
        System.out.println("Main Method");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();

    }


    static {
        System.out.println("Static Block"); // the execution doesn't depend on the object ==> it executes only ONE time!!
    }


}
