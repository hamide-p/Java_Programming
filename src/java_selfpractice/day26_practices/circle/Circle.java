package java_selfpractice.day26_practices.circle;

public class Circle {
    /*Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement
*/

    public double radius;
    public double diameter;

    public static double pi = 3.14;


    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2; // we don't give diameter argument here so no need to use this. method
    }


    public double calcArea() {
        return (radius * radius) * pi;
    }

    public double calcPerimeter() {
        return diameter * pi;
    }

    public static void printPi() {
        System.out.println("PI's value: " + pi);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }


}
