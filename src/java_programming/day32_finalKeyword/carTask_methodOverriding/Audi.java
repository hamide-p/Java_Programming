package java_programming.day32_finalKeyword.carTask_methodOverriding;

public class Audi extends Car {

    /*
    3. Audi
         start(): "Press the start button"*/

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    // we want to give different implementation to start() method by overriding from the parent class


    @Override
    public void start(){
        System.out.println("Press the start button to start "+getMake()+" "+getModel());
    }


}
