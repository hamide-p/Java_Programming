package java_programming.day16_nestedLoop;

public class DoWhileLoop {

    public static void main(String[] args) {


        boolean condition = false;

        for(;condition;){
            System.out.println("Hello Cydeo");
        }


        System.out.println("..............");


        while(condition){
            System.out.println("Hello Cydeo-------While Loop");
        }


        System.out.println("...............");

        // in do condition statements execute at least once even if the while condition is false

        // for and while loop when the condition is false the statemnt never executed

        do  {
            System.out.println("Hello Cydeo-------While Loop");
        }while (condition);




    }
}
