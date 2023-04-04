package java_selfpractice.day20_practices;

public class UniqueElements {

    public static void main(String[] args) {


        /*
        Write a program that can display the unique elements of an array

			MUST use for each loops

         */

      int[] numbers = {2, 3, 45, 434, 54, 22, 2, 1, 45, 3};



        for (int num : numbers) {
            int count =0;
            for (int each : numbers) {

                if(num == each){
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(num + " ");
                count++;
            }
        }




        }
    }

