package java_programming.day28_encapsulation.student;

public class Student {

    // public int age;

    private String name;
    private int age;

    public String getName() {

        if (name == null) { // null isn't string and doesn't return any object ,so we don't use string methods. == operator checks if it exists or not.
            System.out.println(" Name has not been set");
            System.exit(1); // an exit status of 0 indicates that the program executed successfully or  a non-zero exit status indicates some kind of error or abnormal termination
        }
        return name;
    }

    public void setName(String name) {

        boolean hasDigit = false;
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigit = true;
                break;
            }
        }
        if (hasDigit) {
            System.out.println("Invalid name: " + name);
            System.exit(1);
        }

        this.name = name;

    }

    public int getAge() { // by using get method we are able to read(get) the data that the age of the person ===> global recommendation for naming the getter is start with "get"

        // getAge method is the current classes' method, so it has direct access to the variable age

        if (age == 0) {
            System.err.println("Age has not been set");
            System.exit(1); // age can't be default value of 0
        }


        return age;
    }


    public void setAge(int age) {
    /* ↓↓↓↓↓
    The instance variable is a variable that belongs to an object created from a class. Here it's private, which means it can only be accessed within the class itself. To make it accessible from other classes, we create a public method called a setter, which takes a parameter and assigns it to the instance variable. */


        if (age < 1 || age > 100) { // if the age is invalid
            System.err.println("Invalid Age " + age);
            //   return; // exiting the method
            System.exit(1); // terminate the entire program when the invalid age is given and afterwards nothing gets executed

        }
        this.age = age;
    /* ↓↓↓↓↓
    To avoid confusion between the instance variable and the parameter of the setter method (which may have the same name), we use the "this" keyword to refer to the current object. This helps us differentiate between the two variables and ensures that the correct value is assigned to the instance variable.*/
    }


}
