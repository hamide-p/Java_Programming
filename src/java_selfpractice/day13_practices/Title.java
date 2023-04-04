package java_selfpractice.day13_practices;

public class Title {

    public static void main(String[] args) {

        System.out.println(title("java"));

    }




    public static String title(String str){

        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase() ;


    }
}
  /*
  Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java
   */