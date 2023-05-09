package java_programming.day32_finalKeyword.carTask_methodOverriding;

public class Toyota extends Car {

    /*
    Create the following subclasses and override the start() method if needed:

            1. Toyota
                	start(): "Press the brake and twist the key to ignition"

*/

    public Toyota(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

// we don't need to override start()method here, same implementation provided in the parent class

}
