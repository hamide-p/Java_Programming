package java_programming.day29_inheritance.animalTask;

public class Dog extends Animal { // Dog is Animal ==> all the attributes, variables and methods are inherited from animal class
    //        Child      parent

    /*

    Dog
			attributes:


			methods:
					 bark()
*/



    /*
        public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);

        setInfo();
        eat();
        drink();
        sleep();
        toString();
      //  bark(); // bark method has never inherited from animal class
    }*/


    public void bark() { // we can define bark method in Dog class
        System.out.println(name + " is barking");
    }

        /*
   7 variables
   5 methods
   */

}
