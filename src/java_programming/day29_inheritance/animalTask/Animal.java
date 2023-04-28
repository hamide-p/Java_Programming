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

    public String name;
    public String breed;
    public char gender;
    public int size;
    public String color;
    public int age;

    public static boolean isAnimal = true; // same value of all the objects


    static {

        isAnimal = true;
    }

    public void setInfo(String name, String breed, char gender, int size, String color, int age) { // without applying encapsulation we don't need to use setMethod here(setter) ==> instance variables are public
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

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
