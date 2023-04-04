package java_programming.day15_whileLoop;

public class RemoveDuplicates2 {

    /*
3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */
    public static void main(String[] args) {


        String str = "xyzxyzxyz";


        String result = "";


        for (int i = 0; i < str.length(); i++) {

            if(result.contains("" + str.charAt(i))){ // if the character is already contained in new string --> contains need string method that's why we add concatenation to charAt method
                continue; // skip the duplicated ones
            }

            result += str.charAt(i);
        }

        System.out.println(result);


        System.out.println("........................");


        // find the sum of all even number between 50 ~ 100 --> ~ (n+alt)

        for (int i = 50; i < 101; i++) {
            if(i % 2 == 0){  // sayi ikiye bölünüp reminder 0 kaliyosa even olur
                System.out.print(i + " ");

            }
        }


        System.out.println(".................");

        for (int i = 50; i < 101 ; i += 2) { // altern. for finding the even num. //50 , 52, ...100 -> ikiserli arttigi icin 2 kere artirma formülü yaptik

            System.out.print(i+ " ");
        }



        System.out.println(".............");


        for (int i = 50; i <  100; i++) {
            if(i % 2 !=0){ // we skip the odd numbers that we can only write the even num.
                continue;
            }
            System.out.print(i +" ");
        }





    }
}
