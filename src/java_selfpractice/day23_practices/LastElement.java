package java_selfpractice.day23_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class LastElement {

    public static void main(String[] args) {

        /*
        write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,0];
         */

      //  int[]  array = {1,2,3,4,5};

      ArrayList<Integer> list = new ArrayList<>();

      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.set(4,0);// set method doesn't change the size only element
      System.out.println(list);



    }
}
