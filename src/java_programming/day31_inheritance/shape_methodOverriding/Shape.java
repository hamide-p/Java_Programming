package java_programming.day31_inheritance.shape_methodOverriding;

public class Shape {

    private String name;

    public Shape() {
        setName(getClass().getSimpleName()); // set the name of the shape to the simple name of the class


        /*
       the Shape constructor allows us to set the name of a shape to its class name by default, which can be useful in situations where we want to easily identify the type of shape without having to explicitly set the name every time we create a new instance.
       */

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double area() { // we set here default value ,then we can override the area()method in child/subclass for each shape based on its specific calculation.
        return 0;
    }

    public double perimeter() {
        return 0;
    }


    public void draw() { // we declare the draw method without implementation , we implement then in the child/subclass class according to its own shape
        System.out.println("Drawing a " + getClass().getSimpleName() + ": "); // give the clas name
    }

    @Override // we override the toString() method here which it comes from the object class (parent of all classes).
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
