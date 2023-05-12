package java_programming.day32_finalKeyword;

import java.time.LocalDate;

class Student { // final class Student ==> is immutable, can NOT be inherited
// class Student extends String { // public final class String ==> String comes from java.lang package we don't import it, it's done implicitly and declared as final, so we can NOT inherit to any classes

    public final void language() { // some classes can still inherit this final method, but it can NOT be overridden!!!
        System.out.println("Java Programming");
    }


}

public final class FinalKeyword extends Student {

/*

    public void language() { // final methods can NEVER be OVERRIDDEN!!
        System.out.println("Python Programming");
    }
*/

    // public static void main(String[] args) { // doesn't give here any compile error but final method can NOT be overridden!!


    public FinalKeyword() {
    }

    public static void main(String[] args) {

        final char gender = 'M'; // prevent this variable from being reassigned
        System.out.println(gender); // M

        //  gender = 'F'; // compile error, unchangeable

        System.out.println(gender); // F ==> changed to M after final

        System.out.println("................");

        final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

        // dateOfBirth = dateOfBirth.plusYears(1); // unchangeable

        System.out.println(dateOfBirth);

        System.out.println("................");


        new Student().language(); // since it's instance method we have to call it through object ==> we create new object of this class
        new FinalKeyword().language(); // Python Programming


        System.out.println("..................");

        final String name = "James"; // is not eligible for garbage collection ==> final variable
        // name = null; // without creating new object using null keyword ==> eligible to garbage collection

        // name = "Daniel";

        System.out.println(name);


    }

}



