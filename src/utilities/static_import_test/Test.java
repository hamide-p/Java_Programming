package utilities.static_import_test;

import java_programming.day27_accessModifiers.Data; // statics and instance will be accessible after imported by using the regular import statement ==> regular import statement imports everything of this class ( static and instance)

public class Test {


    public static void main(String[] args) {


        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);


        Data.method3();
        Data.method4();

        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

    }
}

