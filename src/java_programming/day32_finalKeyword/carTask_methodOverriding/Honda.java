package java_programming.day32_finalKeyword.carTask_methodOverriding;

public class Honda extends Car {

    /*
     2. Honda
        start(): "Press the brake and twist the key to ignition"*/

    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }


// we don't need to override start()method here, same implementation provided in the parent class


}
