package utilities;
// import java_programming.day27_accessModifiers.Data;
// import static java_programming.day27_accessModifiers.Data.d; // we don't need to use the class name implicitly ==> when we want only static members
// import static java_programming.day27_accessModifiers.Data.method3; // calling one by one from static class

import static java_programming.day27_accessModifiers.Data.*; // this aus-track imports only the static members of the class

public class Test2 {

    public static void main(String[] args) {


        // System.out.println(Data.d);

        System.out.println(d);

        method3();

        System.out.println(e);

        System.out.println(f);


        method4();

       /*

        non-static members can not be called by " import static packageName.className.*  "

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        method1();
        method2();

       */


    }
}
