package java_programming.day33_abstraction.employeeTask;

public class Teacher extends Employee { // ( non-abstract class ) ==> we want to create object from this class, so do NOT use Abstract class here
    /*
    Teacher:
    	work(){ teaching }
*/

    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    } // we must call constructor because it is NOT default!!

    @Override
    public void work() {
        System.out.println(getName() + " is teaching");
    }


    // Parent class' abstract methods MUST be overridden in child (non-abstract) class!!
    // If the child class is abstract class , child class do NOT need to override the parent class' abstract method

}
