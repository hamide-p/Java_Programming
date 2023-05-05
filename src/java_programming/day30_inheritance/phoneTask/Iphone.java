package java_programming.day30_inheritance.phoneTask;

public class Iphone extends Phone { //Iphone Is A Phone


    public Iphone(String model, String size, String color, double price) { // Iphone constructor / subclass constructor

        super("Apple", model, size, color, price);
    }

        /*
        The superclass constructor initializes the inherited fields and sets up any necessary state for the subclass. By calling the superclass constructor using "super", the subclass constructor can then perform any additional initialization steps needed for the subclass.*/



        /*
        In order to use the constructor of the parent class, the child class constructor must either call the constructor of the parent class using the "super" keyword, or the parent class must have a default constructor (a constructor with no parameters).

        If the parent class constructor takes parameters, the child class constructor must pass the appropriate arguments to the parent constructor using the "super" keyword.

        If the parent class constructor initializes instance variables, the child class constructor should also initialize any additional instance variables that are specific to the child class.
        */


    public void faceTime(long phoneNumber) {
        // we can define other methods that parent class doesn't include
        System.out.println(getModel() + " is face timing with " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println(getModel() + " is face timing with " + email);
    }


}




