package java_programming.day18_garbageCollection;

public class Pizza {


    /*
    Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping

			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as

				Pizza cost is determined by:

				* each pizza size start with given price than we add the topping price

		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping
     */



    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;


    // calculates the total price of the pizza, returns it as double
    public double calcCost() {
        double totalPrice = 0;

        switch (size) {
            case 'S':
            case 's': // if user enter lower or upper case we should give or logic like in if statement

                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                // first find the total number of topping
                // and then multiply by 2
                // then add the starting size price of pizza
                break;

            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            default:
                System.out.println("Invalid size: " + size);// for giving wrong size
        }
        return totalPrice;
    }


    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping){ // argument or local variables set to instance variable by using "this." keyword . We can't use without it.

        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }



    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price = " + calcCost() +
                '}';
    }


    /*
    in this method we don't use this. variable because we don't have local variable that is named 'size'.
    this. keyword only use it whenever only there is a local variable that is having the same name as the instance variable then in order to call the instance variable then you will use this. keyword
     */














}
