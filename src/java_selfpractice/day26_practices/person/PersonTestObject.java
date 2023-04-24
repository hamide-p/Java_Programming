package java_selfpractice.day26_practices.person;

public class PersonTestObject {

    public static void main(String[] args) {

        Person person1 = new Person("Emily", 31, 'F');
        Person person2 = new Person("Alfie", 33, 'M');
        Person person3 = new Person("Gabriel", 37, 'M');
        Person person4 = new Person("Mindy", 36, 'F');


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        System.out.println("\n..............................");

        person1.eat("Hamburger");
        person3.eat("Croissant");
        person2.drink("Coffee");
        person4.sleep();


        System.out.println("\n..............................");


        System.out.println(Person.isHuman);
        System.out.println(Person.hasNose);
        System.out.println(Person.hasWings);
        System.out.println(Person.numberOfHead);
        System.out.println(Person.numberOfEyes);


    }
}
