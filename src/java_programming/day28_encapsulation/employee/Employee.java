package java_programming.day28_encapsulation.employee;

public class Employee {


    private String name;
    private int age;
    private String jobTitle;
    private double salary;


    // instance variables arguments should also check and include the conditions which are created in the getter & setter methods
    public Employee(String name, int age, String jobTitle, double salary) {
        setName(name); // doesn't directly assign the arguments age to the instance variables age ==> we want also assign the conditions
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {

        if (age < 16) {
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }


    public String getJobTitle() {
        return jobTitle;
    }


    public void setJobTitle(String jobTitle) {

        if (jobTitle.isEmpty() || jobTitle.isBlank()) {
            System.err.println("Job title of the employee can not be empty or blank");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }


    public String getName() { // READ

        if (name == null) { // when you don't give this condition it wil always give null pointer exception
            name = "Unknown"; // when the name is null it's going to assign the name as "Unknown"
        }
        return name;
    }


    public void setName(String name) {


        if (name.isEmpty() || name.isBlank()) { // WRITE
            System.err.println("Employee name can not empty or blank ");
            System.exit(1);
        }
        this.name = name;
    }


    public double getSalary() { // READ
        return salary;
    }


    public void setSalary(double salary) {


        if (salary < 0) { // WRITE
            System.err.println("Salary can not be negative: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }


    public String toString() { // to print the employee information
        return "Employee{" +
                // "name='" + name + '\'' + // with this way it 'll give an error message
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
