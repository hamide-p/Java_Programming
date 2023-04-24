package java_live_review.week11.access.a;


public class Windows extends Computer {
    /*
      Create a class Windows in package access.a
       inherit the Computer class
       make a main method and create a Windows object. Check to see which variables are accessible

   Then make a class Runner in package access.a
       make a main method and create a Windows object. Check to see which variables are accessible based on their access modifier

        */

    public static void main(String[] args) {


     Windows obj = new Windows();

        System.out.println(obj.os);
        System.out.println(obj.memory);
        System.out.println(obj.brand);
      //  System.out.println(obj.hasWifiCard); // this variables was private, so it is not inherited

        System.out.println();
        System.out.println(obj);





    }

}
