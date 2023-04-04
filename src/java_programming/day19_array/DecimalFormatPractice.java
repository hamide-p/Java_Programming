package java_programming.day19_array;

import java.text.DecimalFormat;


    public class DecimalFormatPractice {


        public static void main(String[] args) {

            DecimalFormat df = new DecimalFormat("0.0000");

            double n1 = 10.587654;
            /*
            output will be:
            10.588

            that's because in math when we convert the 4th decimal numbers into 3rd we add 1 to the 3rd decimal numbers like; 10.587654
                                                          .58(7+1)
                                                          .588
             */

            System.out.println(  df.format(n1)  );



        }


    }