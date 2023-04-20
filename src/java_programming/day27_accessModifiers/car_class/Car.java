package java_programming.day27_accessModifiers.car_class;

public class Car { // outer class


    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;


    // it's created under the car class , inorder to use this class it must be created first "objects"
    public class CarEngine {  // inner class

        public void method() {
            System.out.println(make);
            System.out.println(wheels);
        }
    }


    // in java only the inner class can be static and any other classes can't be declared as static
    public static class StaticInnerClass { // created in the static class, static only accepts STATIC!!!

        public void method() {
            //   System.out.println(make);  ==> only accepts static members of the outer class
            System.out.println(wheels);
        }

    }


}



