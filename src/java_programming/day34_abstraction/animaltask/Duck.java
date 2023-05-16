package java_programming.day34_abstraction.animaltask;

public class Duck extends Animal implements Playable, Swimmable,Flyable {
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck " + getName() + " is eating worm");
    }

    @Override
    public void play() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}
