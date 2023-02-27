package day04_concatenation;

public class PrimitiveTypeCastings {


    public static void main(String[] args) {

       // ------- Implicit Casting -----------


       byte a = 15;

       short b = a;

        System.out.println(b);


        int c = a; // implicit casting

        long d = 3000L;
        float f = d; // implicit casting


        // ------- Explicit Casting -----------



        int x = 100;
        byte y = (byte)x;   // larger primitive type cannot assigned to the smaller primitive type directly   byte y = (short)x;

        float z =20.8F;     // explicit manually large numbers should
        short q = (short)z;  // z = 20.8

        System.out.println(q);

        double n1 = 2.5;
        byte n2 = (byte) n1; // larger primitive data type can't be assigned to smaller data type and double is the largest prim.data type
        // n1= 2.5;
        System.out.println(n2);


        System.out.println(".........................");

        int num = 500;
        byte result = (byte) num; //explicit casting

        System.out.println(result);

        int r = 50000;
        short t = (short) r;
        System.out.println(t);


        System.out.println("........................");

        double u = 3000.5;

        int p = (int)u; // explicit casting

        System.out.println(p);

        int o = 100;
        double d1 = o;
        System.out.println(d1);









    }
}
