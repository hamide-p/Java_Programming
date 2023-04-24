package java_programming.day27_accessModifiers.statics.car_class;

public class TestNestedClassObjects {

    public static void main(String[] args) {


        Car obj1 = new Car(); // Car object from the inner class

        Car.CarEngine obj2 = obj1.new CarEngine(); // CarEngine object
        // to create an object from the inner class, we need to first create an object of the outer class, and then we can create the inner class.
        //a non-static inner class object can be assigned to a reference type of the outer class


        Car.StaticInnerClass obj3 = new Car.StaticInnerClass(); // static inner class ==> we call the static inner class name through the outer class name as well


    }


}
