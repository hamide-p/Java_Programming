package java_programming.day17_customClass;

public class Dog { // don't create a main method here, we are not running this



    public String name; // instance method

    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

   // "Max,    Husky" ,   'M' ,   4, "small", "white"
    public void setInfo(String name, String breed, char gender, int age, String size, String color ){
         this.name = name; // this. keyword is used for calling the instance variable name
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
        // this method can help us to set all the information of the dog

    }



    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking water");
    }


    public String toString() {// to avoid getting hash-codes when we print the class objects
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';

    }
}


/*
 shortcut of toString:
---> go to class you created
---> right click and select "Generate"
---> select toString
---> select all the objects then ok



 */