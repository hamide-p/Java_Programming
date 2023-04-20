package java_programming.day27_accessModifiers.instance_block;

public class InstanceBlock {

       /*
        • Order of the execution ===> Instance Block / Constructor
        • Instance Initialization Block ==> initialize instance variables
        • Only used when we want to give a default values for the instance variables that we have
        • When we want to set each the object separately then constructor is he best choice
       */

    {
        System.out.println("Instance Block");
    }


    public InstanceBlock() {
        System.out.println("Constructor");
    }


    public static void main(String[] args) {

        new InstanceBlock(); // First Instance Block then Constructor  get executed
        new InstanceBlock(); // Instance Block / Constructor  get executed
        new InstanceBlock(); // Instance Block / Constructor  get executed


    }

}
