package java_selfpractice.day19_practices;

public class CommonElements {

    public static void main(String[] args) {

        /*
        Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

         */

       int[] arr1 = {1,2,3,4,5};
       int[] arr2 = {4,5,6,7,8};



        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }



       /* String commonInt = ""; // 2, 4 5
        for (int i = 0, k = 0; i < arr1.length; i++) {

            int a1 = arr1[i];

            for (int j = 0; j < arr2.length; j++) {
                if (a1 == arr2[j] && !commonInt.contains("" + arr2[j])) {
                    commonInt += a1 + " ";
                }
            }
        }
        System.out.println(commonInt);*/ // contains common int

    }
}


