package java_programming.day11_string;

public class StringMethods1 {
    public static void main(String[] args) {


        String str1 = "CYDEO SCHOOL"; // "STRING IS IMMUTABLE" bu olusturulan cümle hafizada degistirilemez asla


       //str1.toLowerCase(); //"cydeo school" "STILL IMMUTABLE" kücük harflerle cikmasini istiyoruz fakat hala yukaridaki gibi büyük harfle output oluyor

        str1 = str1.toLowerCase(); //"cydeo school"---> ama eger reassign yaparsak artik kücük harflere degsitirebiliyoruz.
        // burada bu metod yukaridakini kücük harflere cevirdi

        System.out.println(str1);


        //-----------------------------------------

        String str2 = "java programming";

        String str3 = str2.toUpperCase(); //"JAVA PROGRAMMING"            Burada variable olarak atiyoruz --- reassign yapiyoruz              str3-->str2 referencing to str2 yani isim karisikligi olmasin diye str3 olarakta yazariz (new variable) fakat sonuc yine str2 olur

        System.out.println(str2);

        //---------------------------------------------

        String word = "Wooden Spoon";

        word = word.toUpperCase(); // "WOODEN SPOON"

        word = word.toLowerCase(); // "wooden spoon"

        System.out.println(word);

        //---------------------------------------------
        String str4 = "          Cydeo School"; //  white spaces

        str4 =  str4.trim(); //"Cydeo SchooL" --->removing white spaces      burda boslugu görmek istemedigimiz icin bu metodu kullandik ve reassign yaptik

        System.out.println(str4);


        //---------------------------------------------

        String sentence1 = "Today is Sunday, and we have Java Class";

        int index1 = sentence1.indexOf('w'); // bu metodu 'w' karakterin index sayisini bulmak icin kullaniyoruz. sonuc 21 index number cikiyor yani 22 karakter var

        System.out.println(index1);




        String s1 = "I Love Java Programming";

        //indexOf ---> this method is getting the index numbers --->          for left to right

        int firstA = s1.indexOf('a'); // burda birkac 'a' oldugu icin ilk olani ariyoruz --->sonuc index 8

        System.out.println(firstA);

        int secondA = s1.indexOf("a "); // burda ikincisine bakarken ilk metodu kullanamayiz cünkü o sadece ilk 'a'yi buluyor buyüzden özel bir sequence kullanmamiz gerek---> "a " --->Java P --> ikinci a'nin yaninda bosluk var oyüzden stringin icinde bosluk biraktik

        System.out.println(secondA);



        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');

        System.out.println(a1);

        int a2 = s2.indexOf("a Python");

        System.out.println(a2);

        int a3 = s2.indexOf("avaS");

        System.out.println(a3);

        int a4 = s2.indexOf("aS");

        System.out.println(a4);

        //-----------------------------------------


        //lastIndexOf ---> this method is checking the index numbers from  --->          right to left

        String w = "Java";

        System.out.println(w.indexOf('a')); //1

        System.out.println(w.lastIndexOf('a')); //3  last 'a' index

        String w2 = "Java Python JavaScript Cydeo Python";


        System.out.println(w2.lastIndexOf('a'));//sonuncu 'a'ya bakiyor

        System.out.println(w2.lastIndexOf('P'));





    }
}
