package java_programming.day33_abstraction;

import java_programming.day32_finalKeyword.personTask.Person;

import java.time.LocalDate;

// we make CydeoDevStudent clas final inorder to prevent inheriting from any other subclasses
public final class CydeoDevStudent extends Person { // parent class has a constructor that is not default, so  we should call it explicitly.


    /*
    1. Create a subclass of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables


                */


    private final String id; // id could be different [instance or static] so use instance variable & use final for not changing the variable value

    private String batchName;
    private int batchNumber;

    public static final String programmingLanguage; // static ==> java (one value for all students) , final ( not changing the value )


    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        if (getAge() < 18) { // if age is set to less than 18, display error message
            System.err.println("Cydeo Developer student must be at least 18 years old");
            System.exit(1);
        }
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    // constructor for setting the instances but static block setting the steps

    static {

        programmingLanguage = "Java";
    }


    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }


    public void setBatchName(String batchName) {
        if (batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni dev")) {
            this.batchName = batchName;
        } else { // otherwise: if the batch name is invalid
            System.err.println("Invalid batch name: " + batchName + " \nNo such a batch at Cydeo");
            System.exit(1);
        }

    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0) {
            System.err.println("Invalid batch number: " + batchNumber + "\n Batch number can not negative or zero");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating " +  "Programming language");
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking " +  "Programming language");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " doesn't need to sleep");
    }


  //  public final void breath(){} // final method can not be overridden!!


    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                " gender=" + getGender() +
                " age=" + getAge() +
                " dateOfBirth=" + getDateOfBirth() +
                "id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
