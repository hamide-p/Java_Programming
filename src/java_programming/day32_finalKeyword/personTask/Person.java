package java_programming.day32_finalKeyword.personTask;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person {

   /*
Variables:
    name, gender, age, dateOfBirth
    numberOfHead

Methods:
    eat(), drink(), sleep()
    breath()
 */



         /*
   final variable:

     #1 Variables can NOT be changeable!!
     #2 Final do NOT have DEFAULT value. We initialize it before getting executed.
     #3 We should initialize methods and instance variables before creating the object.
     ==> constructor, static block etc.
     #4 If the instance variable is final, we can only getter, we can NOT generate setter (setMethod) for it.
     #5 finalMethod() can not be overridden !!
     #6 finalClass() can not be extended/inherited !!
     # 7 without using final we can continuously reassign the variables and methods
                             *********************************************
      Option1: If we initialize it in one line,
               directly initialize it right after declaration.[not the best practice]
      Option2: If we have to use steps in order to initialize the variable,
               we have to do it in constructor.[no setter]
                             *********************************************
                      Do not get confused about static & final
                      if model static:
                       Audi.model = "A4"; --> only one copy. However , we can re-assign it.
                       Audi.model = "A3"; -> static variables can be reassigned !

                      if model final:
                      Final variables can instance !!
                      obj1.model = "Q7";
                      obj1.model = "Q5"; // can not be reassigned/changed !!
                      obj2.model = "A3";
 */

    private String name;
    private final char gender; // do Not have default value ==> initialize first before use it

    private final int age; // do NOT initialize right away, we should use arguments in constructor
    private final LocalDate dateOfBirth;
    public static final int numberOfHead; // do Not have default value ==> initialize first before use it

    // use static variable through the class name

    static {
        numberOfHead = 1; // when we initialize the static variables in the static block ,then we can use final without compile error
    }

    public Person(String name, char gender, LocalDate dateOfBirth) { // we can use final with constructor without any issue of compile error
        setName(name);
        if (!(gender == 'M' || gender == 'F')) { // we give conditions in order to set the final [gender, age]
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
        this.dateOfBirth = dateOfBirth;
    }

    // we can read the final with getter() method

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // we can NOT change the value of the variable by using final so final refuses the change

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public final void breath() { // To make sure that this implementation will not change for any subclass
        System.out.println(name + " is breathing");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                " gender=" + gender +
                " age=" + age +
                " dateOfBirth=" + dateOfBirth +
                '}';


    }
}
