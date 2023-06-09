package java_programming.day34_abstraction.animaltask;

public abstract class Animal {

    private String name, breed;
    private final char gender; // Once we make gender final, we cannot use a setter method to modify it. The only way to set the value of gender is through the constructor.

    private int age;
    private String size, color;

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        this.gender = gender; // through the constructor for setting the gender
        setAge(age);
        setSize(size);
        setColor(color);
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

    public abstract void eat();

    public void sleep() {
        System.out.println(name + " sleeps 8 hours");
    }

    public void drink() {
        System.out.println(name + " is drinking water");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}

/*
  Notes From Daily Class:

  * class extends abstracts class
  * abstract class extends abstract class
  * abstract class extends  class
  * class implements interfaces
  * abstract class implements interfaces
  * interface extends interface


***********************************


abstraction : abstract class & interface [there is no other option]

abstract methods in an interface

#1 abstract class implements interface --> do I have to implement those abstract methods ? NO
Because abstract classes can have abstracts methods.

#2 interface extends interface --> do I have to implement those abstract methods ? NO
Because implement can have abstracts methods.

#3 concrete/regular classes extends abstract class or/and interface with abstract methods in it --> do I have to implement those abstract methods ? YES
Because concrete class can NOT have abstracts methods.
We have to implement those abstract methods in order to do inheritance/


 */