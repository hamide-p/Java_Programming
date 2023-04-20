package java_programming.day27_accessModifiers.car_class;

import java_programming.day27_accessModifiers.car_class.Car;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car(); // Car object
        Car.CarEngine obj2 = obj1.new CarEngine(); // CarEngine object


        new Car.StaticInnerClass(); // static inner class



    }



}
