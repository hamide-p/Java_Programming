package java_programming.day33_abstraction.employeeTask;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() { // in order to avoid the compile error that has occurred in class developer , we must override the abstract parent class' method

        System.out.println(getName() + " is coding in " + programmingLanguage);
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", programming language =" + programmingLanguage + "}"; // short usage of calling toString() from employee (parent) class

    }
}
