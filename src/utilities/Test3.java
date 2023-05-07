package utilities;

import java_programming.day31_inheritance.ProtectedAccessModifier;

public class Test3 extends ProtectedAccessModifier {


    // protected is accessible outside the package when there is inheritance otherwise it can NOT be accessible!!

    public static void main(String[] args) {

        System.out.println(ProtectedAccessModifier.a);
        ProtectedAccessModifier.methodA();
    }
}
