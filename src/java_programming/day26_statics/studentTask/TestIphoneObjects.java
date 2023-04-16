package java_programming.day26_statics.studentTask;

import java_programming.day26_statics.IPhone;

public class TestIphoneObjects {
    public static void main(String[] args) {


        IPhone iPhone = new IPhone ("iphone12", "Black", 1000);

        System.out.println(iPhone.model); // calling through the object
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

        //  when you call static through the object it will be error cause statics they go to the class, they don't depend on the objects
       /*
       System.out.println(iPhone.brand); // unnecessary step - not legal
        System.out.println(iPhone.OS); // unnecessary step - not legal
        iPhone.printOperatingSystem(); // unnecessary step - not legal
        */



        System.out.println(IPhone.brand); // right way to call statics are through the class name
        System.out.println(IPhone.OS);
        System.out.println(IPhone.madeIn);
        IPhone.printOperatingSystem(); // calling the static method




    }

}
