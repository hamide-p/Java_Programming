package java_programming.day19_array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {



      String[] myGroup = new String[5];


      myGroup[0] = "Gülcin";
      myGroup[myGroup.length-1] = "Aseel";
      myGroup[2] = "Sumeye";
      myGroup[1] = "Abidullah";
      myGroup[3] = "Khaskavar";

        System.out.println(Arrays.toString(myGroup));



        myGroup[1] = "Kuzzat";
     //   myGroup[5] = "Muhtar";

        System.out.println(Arrays.toString(myGroup));


        System.out.println("...............");


        for (int i = myGroup.length-1; i > 0; i--) { // reversed order
            System.out.println(myGroup[i]);
        }


        System.out.println("..............");


       /* for (int i = 0; i < myGroup.length; i++) { --> shortcut of for loop ----> myGroup.fori

        }
        */


      /*  for (int i = myGroup.length - 1; i >= 0; i--) { --> shortcut of reversed loop ----> myGroup.forr
        }
       */









    }
}
