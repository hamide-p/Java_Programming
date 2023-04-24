package java_programming.day27_accessModifiers.statics.instance_block;

public class InstanceInitializationBlock {

    public String name;
    public int age;

 /*
       • it can only initialize some known data into the variables mentioned above during their creation
       • it get executed for every single object
       • it get executed for every single object
       • Only used when we want to give a default values for the instance variables that we have
       • When we want to set each the object separately then constructor is he best choice
  */


   /*
    {
        name = "James"; // james 'll be given by default
        age = 20; // default age 'll be 20
    }
*/


    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {


        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("James", 25);
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Aaron", 28);


        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }


}
