package java_programming.day30_inheritance.phoneTask;

import java.util.Arrays;

public class Phone {


    /*
    Create a named Phone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. price can not be zero or negative
						2. color can only be set to:
								{"Black", "White", "Silver", "Gold", "Pink"}

				Add a constructor that can set all the fields

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
					*/

    private String brand, model, size, color; // preferred not static, not public
    private double price; // preferred not static, not public


    public Phone(String brand, String model, String size, String color, double price) { // constructor can not be inherited to the child class
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        String[] colors = {"Black", "White", "Silver", "Gold", "Pink"};
        if (Arrays.asList(colors).contains(color)) {
            this.color = color; //if it's contain the colors in array list then add to the color instances
        } else { // if it's not contain then display error message
            System.err.println("Invalid color:" + color + "\n color of the can only be: " + Arrays.toString(colors)); // we concatenate the array list of colors to warn that it should only include those colors
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0) {
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }



    public void call(long phoneNumber){
        System.out.println(getBrand() + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getBrand() + " is texting to " + phoneNumber);
    }



    public String toString() {
        return getClass().getSimpleName() + "{" + // get class came from object class in java and the parent of any class
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
        
    }
}
