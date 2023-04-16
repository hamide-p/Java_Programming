package java_programming.day26_statics;

public class IPhone {


    /*
    Attributes:
    brand, model, color, price, Operating System (OP), madeIn, hasBattery, isTouchScreen, isExpensiveToFix

     */


    public  static String brand = "Apple";// static : all the objects of the Iphone class shares the same copy of brand ===>"Apple" is the brand of  all the iphone objects

    // static public ===> we can also use in this way but not preferred

    public String model; // instance: different models for Iphone objects

    public String color; // there are multiple options for the color for all the objects of the Iphone class


    public double price;

    public static String OS = "iOS"; // static : one operating system for all the Iphone objects

    public static String madeIn = "China";

    public static boolean hasBattery = true; // static: every single IPhone has battery
    public static boolean isTouchScreen = true; // static: every single IPhone has touch screen
    public static boolean isExpensiveToFix = true;

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }


    // static method ==> static ONLY ACCEPTS statics  ↓↓
    /*
    public static void  printPhoneInfo(){ // static is a class member and class doesn't come from the object however object come from the class

        System.out.println("Model:" + model); // compile error ==>  "model" is here instance variable that's why we should also provide  instance method in order to use

       */



    // instance method  ===> instance variables ↓↓
    public void printPhoneInfo(){ // instance methods accepts both static and none static methods

        System.out.println("Brand: " + brand); // brand is static but instance method it can share both object class members
        System.out.println("Model:" + model);
        System.out.println("Color:" + color);
        System.out.println("Price: " + price);
    }




        public static void printOperatingSystem(){
            System.out.println("Operating System: " + OS);
        }




    /*
    • If we declare any methods as static, it’s known as static methods
    • A method that can be called using class name, without creating objects
    • Objects can also call static methods
    • Static methods only accept static (class) members , it doesn't accept the object members
    • instance variable or instance method ==> instance method


     */










}
