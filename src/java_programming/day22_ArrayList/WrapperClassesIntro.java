package java_programming.day22_ArrayList;

public class WrapperClassesIntro {


    public static void main(String[] args) {



        String str = "Java";


        int a1 = 10;
        Integer a2 = 10;

        System.out.println("...............");


        int b1 =100;
        Integer b2 = b1; // auto boxing

     //    Long b3 = b1; --> compile error
     //    Long b3 = (long)b1; --> doesn't a good practice
     //   Double b4 = b1; --> compile error ,it doesn't take any primitive value
        long c2 = b1; // implicitly casting to the primitive type

        char ch = 'A';

        Character ch2 = ch; // Autoboxing

        double db = 5.5;

        Double d2 = db; // Autoboxing


        System.out.println("...............");

        Integer n1 = 20;

        int n2 = n1; // unboxing
      //  long n3 = n1;
      //  double n4 = n1;

       Character e1 = 'Z';

       char e2 = e1; // unboxing -> implicitly -->always use its own primitive
      // int e3 = e1;  value will be changed
      // long e4 = e1; value will be changed






    }
}
