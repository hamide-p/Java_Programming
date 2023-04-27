package java_programming.day28_encapsulation.personTask;

public class Person {

    /*Create a class named Person:
                Variables:
                    name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

                Add a constructor to initialize name

                Add a constructor to initialize name and age

                Add a constructor to initialize name and language

                Add a constructor to initialize name and gender

                Add a constructor to initialize name, age and gender

                Add a constructor to initialize name, age, gender, language

                Add a static block to initialize all the statics

                Methods:
                    printPlanetName()
                    eat(String food)
                    drink(String drink)
                    toString()


    */

    // String name; ==> when we don't use ACCESS MODIFIER we can only access this instance from PersonTask package
    public String name, language;
    public int age;
    public char gender;
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHeads;


    public Person(String name) { // allows us to create Person object just by setting the name of the person
        this.name = name;
    }


    public Person(String name, int age) { // allows us to create Person object just by setting the name & age of the person
        this(name); // we call the 1st constructor by its name
        this.age = age;
    }


    public Person(String name, String language) { // allows us to create Person object just by setting the name & language of the person
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) { // allows us to create Person object just by setting the name & gender of the person
        this(name);
        this.gender = gender;
    }


    public Person(String name, int age, char gender) { // allows us to create Person object just by setting the name, age & gender of the person
        this(name, age);
        // this(name,gender); one constructor can not call more than one constructor
        this.gender = gender;
    }

    public Person(String name, String language, int age, char gender) { // allows us to create Person object just by setting the name, age, gender & language of the person
        this(name, age, gender);
        this.language = language;

    }


    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHeads = 1;

        //  name = "Josh";  ==> instance variable name can't be called here. Static only accepts STATICS!!
    }


    // we don't need to create object every single time, so we use here static method instead instance method ( we can still use instance method here but not efficient)
    public static void printPlanetName() {
        System.out.println("Planet name is: " + planet);
    }

    public void eat(String food) { // non-static method is efficient here
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    @Override
    public String toString() { // instance method accepts both instance and static
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender + '\'' +
                ", planet=" + planet + '\'' +
                '}';



    }
}
