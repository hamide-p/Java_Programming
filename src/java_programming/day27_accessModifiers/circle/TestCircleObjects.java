package java_programming.day27_accessModifiers.circle;

public class TestCircleObjects {


    public static void main(String[] args) {


        // constructor gets executed separately for each object
        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(7);


        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);


        System.out.println(circle1.pi); // we are getting the same value of pi
        System.out.println(circle2.pi);
        System.out.println(circle3.pi);


        //  System.out.println(Circle.radius); // compile error ==> radius belongs to the object and class CAN'T share what the object has
    }
}
