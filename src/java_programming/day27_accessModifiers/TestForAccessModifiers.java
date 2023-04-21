package java_programming.day27_accessModifiers;

public class TestForAccessModifiers {

    public static void main(String[] args) {


        System.out.println(AccessModifiers.publicDate); // public is accessible within the same package

        System.out.println(AccessModifiers.protectedData); // protected is accessible within the same package

        System.out.println(AccessModifiers.DefaultDate); // default is accessible within the same package

        //  System.out.println(privateData); // private is NOT accessible within the same package


        new AccessModifiers(); //  public constructor is accessible within the same package


        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        // AccessModifiers.privateMethod(); ==> not accessible


    }
}
