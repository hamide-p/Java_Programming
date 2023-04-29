package java_programming.day29_inheritance.animalTask;

public class Animal {
    /*
    Animal

			attributes:
					name, breed, gender, size, color, age

			methods:
				setInfo(), eat(), sleep(), drink(), toString()
*/


    // we don't need to declare in another classes

    private String name;
    private String breed;
    private char gender;
    private String size;
    private String color;
    private int age;

    public static boolean isAnimal = true; // same value of all the objects


    static {

        isAnimal = true;
    }

    public void setInfo(String name, String breed, char gender, String size, String color, int age) { // without applying encapsulation we don't need to use setMethod here(setter) ==> instance variables are public
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.color = color;
        this.age = age;

    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking water");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        this.color = color;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + // getClass: ( it gives full class info ==> package & class name ) , getSimpleName(): (it gives us only the class name)
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
