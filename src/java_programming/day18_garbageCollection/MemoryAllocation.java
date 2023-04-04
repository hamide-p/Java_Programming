package java_programming.day18_garbageCollection;

import java_programming.day17_customClass.Employee;

class Car{


    public String brand;
    public String model;
    public String color;
    public int year;
}




public class MemoryAllocation {

    public static void main(String[] args) {

        int a = 100; // local variable --> int and a both stored in stack memory


        Car car = new Car(); // reference object
        //  stack   heap


        System.out.println(".............");
        Employee employee1 = new Employee();
        Employee employee2 = employee1; // one object stored in heap but there are 2 reference objects


        employee1.setInfo("Rehane", 30, 'F', "Java Developer", 95000, "A12");
        System.out.println(employee1);
        System.out.println(employee2);// one setInfo one object but 2 reference names


        System.out.println("................");

        /*
        String batch1 = new String("Java");
        String batch2 = new String("Java");
        String batch3 = new String("Java");

        */

        String batch1 = new String("Java"); // 1 objt allocated in the heap
        String batch2 = batch1; // less memory usage
        String batch3 = batch1; //  3 reference variables referencing to 1 object








    }

public static void method1(){

        int b = 200; // stack memory

}


  public static void method2(){


        String c = "Hello World";
        //   stack      heap (String Pool)

      // c is local variable is referencing to an object called as reference object---> "Hello World" to the heap memory but 'c' variable is in to the stack


      String d = new String("hello world");
      //     stack      heap
  }



}
