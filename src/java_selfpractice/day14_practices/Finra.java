package java_selfpractice.day14_practices;

public class Finra {

    public static void main(String[] args) {


        for(int i = 1; i < 100; i++ ){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FINRA");
            }else if(i % 3== 0){
                System.out.println("FIN");
            }else if (i % 5 == 0) {
                System.out.println("RA");
            }else{
                System.out.println(i + ""); // string'E toplama isareti yapcaksak böyle concatenation yapabiliriz.
            }
        }



    }
}
 /*

 Write a method which prints out the numbers from 1 to 100 but for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,  for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.

    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN
  */