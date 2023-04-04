package java_selfpractice.day17_practices;

public class Car {

/*
1. Create a custom class named Car
		Attributes:
			make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in print statement, it should display all the information of the car object
			start()


 */



    public String make;
    public String model;
    public String color;
    public int year;
    public int price;


    public void setInfo(String make, String model, String color, int year, int price){

        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }


}



