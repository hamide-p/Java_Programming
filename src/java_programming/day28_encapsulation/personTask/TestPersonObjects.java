package java_programming.day28_encapsulation.personTask;

public class TestPersonObjects {


    public static void main(String[] args) {


        Person person1 = new Person("Daniel");
        Person person2 = new Person("Sascha", 'M');
        Person person3 = new Person("Lotta", 33);
        Person person4 = new Person("Nina", "English");
        Person person5 = new Person("Flinn", 41, 'M');
        Person person6 = new Person("Lucy", "English", 32, 'F');

        person4.name = "James"; // only the 4th person name has changed ==> non-static

        //  person1.planet = "Mars"; // calling by object name (wrong way) ==> change all the objects ==>  static

        // Person.planet = "Mars"; // calling by class name ==> have the same copies of all the objects ==> have the same planet name


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);


        Person.printPlanetName();

        person1.eat("Sushi");
        person2.drink("Ginger Shot");
        person5.drink("Latte");
        person6.drink("Chai Latte");


    }
}
