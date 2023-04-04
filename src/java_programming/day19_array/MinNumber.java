package java_programming.day19_array;

public class MinNumber {
        /*
Write a program that can find the minimum number from an array
 */
    public static void main(String[] args) {
        
        int [] numbers = {89, -26, 100, 82, 8, 3, 88 };
        int min = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("min = " + min);

        
        
    }
}
