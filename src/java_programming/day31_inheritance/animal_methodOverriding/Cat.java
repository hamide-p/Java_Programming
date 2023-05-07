package java_programming.day31_inheritance.animal_methodOverriding;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    @Override
    public void eat() { // overridden method
        System.out.println("Cat" + getName() + " is eating cat food");
    }


    /*
    @Override      // we can't override here, access modifier is less visible
    protected void eat(){
        System.out.println("Cat" + getName() + " is eating cat food");
    }
    */


    /*
    @Override      // we can't override here, return type is different
    public int eat(){
        System.out.println("Cat" + getName() + " is eating cat food");
        return 0;
    }
    */


    @Override
    public void sleep() {
        System.out.println("Cat" + getName() + " sleeps 12 hours in a day");
    }

    public void scratch() {
        System.out.println("Cat " + getName() + " is scratching");
    }


}
