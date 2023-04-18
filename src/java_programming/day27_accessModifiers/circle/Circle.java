package java_programming.day27_accessModifiers.circle;

public class Circle {


    /*
    Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter of the java_programming.day27_accessModifiers.circle when the object of java_programming.day27_accessModifiers.circle is passed in the print statement

     */


    public double radius, diameter;

    public static double pi = 3.14;


    public Circle(double radius) { // as long as we have a diameter argument we can calculate the radius
        this.radius = radius; // we call the instance variable radius with the same name of local variable radius
        diameter = radius * 2; // we don't need to assign "this."
    }


   /*
   public static double calcArea(){ // static only accepts statics
        return radius * radius * pi; // instance variables
    }
    */


   /*
   • Instance methods are object members, and they can access and share  whatever the object has, including static variables or methods.
   • However, static methods belong to the class members and can access and share whatever the class has, but they can only accept static members.


   •Accessing and using static methods and variables is often easier than using instance methods because instance methods require you to call them through an object, which involves memory allocation. In contrast, static methods and variables can be called directly through the class name, with no need for memory allocation. NOT every method or variable can be static.


    */
    public double calcArea(){ // can't be static cause java_programming.day27_accessModifiers.circle area can be changeable
    return radius *  radius * pi; // return the square of radius
    }


    public double calcPerimeter(){
        return 2 * radius * pi; //  diameter ===> 2 * radius
    }


    public static void printPiValue(){
        System.out.println("PI value is: " + pi);
    }



    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI=" + pi + // this instance method still access the static variables
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
