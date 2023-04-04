package java_live_review.week2;

public class CellPhone {

    public static void main(String[] args) {


        String brand = "Apple", model = "Iphone X", color = "Black";

        double price = 1200.99;
        int storage = 128;
        boolean hasCamera = true;
        char simType = 'A';


        System.out.println("We have a brand new" + model + " from " + brand);
        System.out.println("It comes in the color " + color + " and has " + storage + "GB memory");
        System.out.println("It has a camera: " + hasCamera + " and operates with the \"" + simType + "\" type sim\nGet your very own " + model + " for only $" + price );

        // as a variable

        System.out.println("................");

        String ad = "We have a brand new " + model + " from " + brand +
                "\nIt comes in the color " + color + " and has " + storage + "GB memory" +
                "\nHas a camera: " + hasCamera + " and operates with the \"" + simType + "\" type sim" +
                "\nGet your very own " + model + " for only $" + price;

        System.out.println(ad);
    }




}
/*
Practice Tasks:

CellPhone [variables, concatenation]

	Declare and assign the following variables:
		brand, model, color, price, storage, has camera, sim type (A, B, or C)

	Print out an advertisement post about the phone in this format:
		-> For extra practice also create this advertisement in a reusable way

		ex: if the given data was this: Apple, IPhone X, Black, 1200.99, 128, true, A
		the output would be:

		We have an brand new IPhone X from Apple
		It comes in the color Black and has 128GB memory
		It has a camera and operates with the "A" type sim
		Get your very own IPhone X for only $1200.99

 */