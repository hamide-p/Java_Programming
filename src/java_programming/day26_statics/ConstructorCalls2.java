package java_programming.day26_statics;

public class ConstructorCalls2 {


    public ConstructorCalls2(){
      //  this(9); --> Constructor can not call or contain itself
        System.out.println("Default");
    }

    public ConstructorCalls2(int a){
        this(); // --> calling the default constructor
        // this("A"); --> One constructor can not call more than one constructor
        System.out.println("int arg");

    }

    public ConstructorCalls2(String a){
        this(10);
        System.out.println("string a");
    }


    public static void main(String[] args) {



        ConstructorCalls2 obj1 = new ConstructorCalls2(); // Default

        System.out.println("\n.............................");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10); // Default
                                                               // int arg



    }

}
