package java_programming.day33_abstraction.employeeTask;

public abstract class Employee { // abstract class is also a generic class that we can not create any object from here
    //  public abstract class Employee { // we can not use final , this class must be a parent class

    /*
    Employee:
		Variables:
			name, age, gender, id, jobTitle, salary ....

		Methods:
		  abstract work();
*/

    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work(); // abstract method (uncompleted method)
    // abstract method meant to be OVERRIDDEN!!
    // public abstract final void work(); // FINAL, STATIC, PRIVATE
    //                 static                                        CAN NOT
    // private                                                                 BE OVERRIDDEN!!



    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
