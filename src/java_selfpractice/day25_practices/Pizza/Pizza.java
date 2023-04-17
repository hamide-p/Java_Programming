package java_selfpractice.day25_practices.Pizza;

public class Pizza {

    /*
    Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

     */


    public char size;
    public int numberOfCheeseTopping,
            numberOfPepperoniTopping;


    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public double calcCost(){
        double cost = 0;

        switch(size){
            case 'S':
            case 's':
            cost += 10 + 2 * (numberOfCheeseTopping+ numberOfPepperoniTopping);
            break;

            case 'M':
            case 'm':
                cost += 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'L':
            case 'l':
                cost += 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
    }
    return cost;
    }


   /*
   public double calcCost(){
        double cost = 0;

        if( size == 'S' || size == 's'){
            cost += 10 + 2* (numberOfCheeseTopping + numberOfPepperoniTopping);
        }else if(size == 'M' || size == 'm'){
            cost += 12 + 2* (numberOfCheeseTopping + numberOfPepperoniTopping);
        }else {
            cost += 14 + 2* (numberOfCheeseTopping + numberOfPepperoniTopping);
        }
        return cost;
    }
    */




    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", pizzaCosts=" + calcCost() +
                '}';
    }




}