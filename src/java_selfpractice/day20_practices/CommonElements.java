package java_selfpractice.day20_practices;

public class CommonElements {

    public static void main(String[] args) {

        /*
        Write a program that can print out the common elements from two integer array
        Ex:
        arr1: {1,2,3,4,5}
        arr2: {4,5,6,7,8}

        output:
        4 5


        MUST use for each loops
        */


       int[] arr1= {1,2,3,4,5};
       int[] arr2= {4,5,6,7,8};




        for (int each : arr1) {

            for (int each2 : arr2) {


                if(each == each2){
                    System.out.println(each + " ");
                }
            }
        }

        System.out.println("................");

        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {4, 5, 6, 7, 8};


        String commonElements = ""; // 4 5

        for (int number : arr1) {

            for (int num : arr2) {

                if (number == num && !commonElements.contains(""+ number)) {
                    commonElements+= num+ " ";
                }
                if(num == number){
                    System.out.print(num + " ");
                }
            }
        }
         System.out.println("commonElements = " + commonElements);



    }
}
