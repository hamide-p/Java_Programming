package java_programming.day29_inheritance.animalTask;

public class Zoo {


    public static void main(String[] args) {


        Dog dog = new Dog();
        Cat cat = new Cat();
        Tiger tiger = new Tiger();

        dog.setInfo("Bobo", "Golden Retrievers", 'M', "Large", "Golden", 3);
        cat.setInfo("Caramelo", "British Shorthair", 'M', "Large", "Caramel", 2);
        tiger.setInfo("King", "Bengal", 'M', "Large", "Orange", 5);


        System.out.println(dog); // output : default
        // Animal{name='null', breed='null', gender= , size=0, color='null', age=0}  ===> we created toString method in Animal class, so it only prints Animal ,but we use then getClass().getSimpleName() methods inorder to print  only the class name

         /*
            public String toString() {
            return getClass().getSimpleName() + "{" +
                    "name='" + name + '\'' +
                    ", breed='" + breed + '\'' +
                    ", gender=" + gender +
                    ", size=" + size +
                    ", color='" + color + '\'' +
                    ", age=" + age +
                    '}';
        }*/

        System.out.println(cat);
        System.out.println(tiger);


        System.out.println("\n..............................");

        dog.eat(); // dog object inherited the methods from animal class
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.sleep();
        cat.drink();

        tiger.eat();
        tiger.sleep();
        tiger.drink();

        System.out.println("\n..............................");

        dog.bark(); //  a unique method that we defined in the Dog class itself
        // cat.bark(); // we defined this method only in Dog class (child class)
        // tiger.bark(); // we defined this method only in Dog class (child class)


        cat.meow();
        //  dog.meow();
        //  tiger.meow();

        tiger.hunt();
        // dog.hunt();
        // cat.hunt();


        System.out.println("\n..............................");


     /*
        System.out.println(dog.name);
        System.out.println(dog.color);

        dog.gender = 'K';
        dog.age = -100;
*/

        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.setGender('F');
        dog.setAge(8);

        System.out.println(dog);

    }
}
