package java_programming.day31_inheritance.shape_methodOverriding;

public class Square extends Shape { // parent class constructor called by default(no argument) which is called implicitly

    private double side;

    public Square(double side) { // implicitly called parent classes constructor
        setSide(side);
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square:");
        System.out.println("\t* * * * * *");
        for (int i = 0; i < 4; i++) {
            System.out.println("\t*         *");
        }
        System.out.println("\t* * * * * *");
    }
}
