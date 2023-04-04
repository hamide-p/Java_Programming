package java_selfpractice.day18_practices;

public class Carpet {
/*

    Create a class named Carpet:
	 		Attributes:
                width
                length
                unitPrice
                isPersian


            Actions:
        		setInfo(): sets all the fields
                calcCost(): should be able to calculate the total cost of the carpet and return it as double
                toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()


		    total price of carpet = (width*length) * unit-price

		    if the carpet is Persian  carpet, add 200$ to the totalPrice
*/



    public int width1, length;
    public double unitPrice;
    public boolean isPersian;


    public Carpet(int width, int length, double unitPrice, boolean isPersian) {
        width1 = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }



    public double calcCost() {
        double totalCost = (width1 * length) * unitPrice;

        if (isPersian) {
            totalCost += 200;
        }
        return totalCost;
    }


    public String toString() {
        return "Carpet{" +
                "width1=" + width1 +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }
}


