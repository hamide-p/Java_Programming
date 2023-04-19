package java_programming.day27_accessModifiers.StaticBlocks;

public class StaticInitializationBlock {

    public static int a;  // we can also initialize this variable like this but not recommended ==> public static int a = 100;
    public static double b;
    public static String c;


    /*
    public static ExcelSheet sheet; ==> in order to set this variable we need static blocks ==> static blocks get executed automatically when the class loaded but other method blocks NOT!!
    */
    static {

        a = 100;
        b = 20.5;
        c = "Java";
    }


    /*

    public StaticInitializationBlock() {

     • constructor only get executed when we create an object.
     • creating an object every single time is not a good choice when we call the static variables.
     • we shouldn't initialize  statics within the Constructor.

        a = 100;
        b = 20.5;
        c = "Java";*/


    /*
    public static void main(String[] args) { // main method does not get executed in other class unless you call it from this class !!
        a= 100;
        b=20.5;
        c ="Java";
    */


}
