package java_selfpractice.day16_practices;

public class NestedShape {


    public static void main(String[] args) {


        char ch = '*';

        for (int i = 1; i < 11; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print(ch + " ");

            }

            System.out.println(); // new tab
        }
        
        
    }
}
