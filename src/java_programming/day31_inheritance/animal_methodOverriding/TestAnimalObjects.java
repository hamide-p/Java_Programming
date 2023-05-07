package java_programming.day31_inheritance.animal_methodOverriding;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Emily", "Bangle", 'F', 4, "Small", "Gray");

        Dog dog = new Dog("Max", "Husky", 'M', 3, "Large", "White");

        Lion lion = new Lion("Simba", "African Lion", 'M', 6, "Large", "Yellow", true);

        Eagle eagle = new Eagle("Bella", "American Eagle", 'F', 4, "Medium", "Black & White");


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);


        System.out.println("....................");


        // eat() method, which is defined in the Animal class, is implemented in various ( cat, dog, eagle, lion) subclasses of Animal. Same eat method but different implementation
        cat.eat(); // CatEmily is eating cat food
        dog.eat(); // Dog Max is eating food
        eagle.eat(); // Eagle Bella is eating snake
        lion.eat(); // Lion Simba is eating deer


        System.out.println("....................");


        cat.sleep(); // CatEmily sleeps 12 hours in a day ( overridden in the cat class)
        dog.sleep(); // Max is sleeping ( not overridden)
        eagle.sleep(); // Bella is sleeping ( not overridden)
        lion.sleep(); // Simba is sleeping ( not overridden)
    }

}
