package java_programming.day06_ifStatements;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println(5 + 2 * 3); // 11 ---> order of precedence (öncelik sirasi ): islemlerin siralamasi var mesela carpma toplamadan önce gelir


        System.out.println( 7 + 3 - 2 / 2); // 9 ----> önce bölme sonra toplama daha sonra cikarma islemi yapiyoruz -->order of precence tablosuna göre


        System.out.println( -5 + 3); // -2 negative 2

        System.out.println( 10 >  9 == 8 < 7  && "Java" == "Python" || 'a' == 'A');
                        //   true  == false   &&   false            || false
                        //         false      &&  false   || false
                        //          false                 || false
                        //               false


        System.out.println( 100 >= 20 && 40 * 2 > 60);

                          // 100 >= 20 && 80 > 60
                          //   true   &&  true
                          //     true


        int a = 20;

        a += 10 + 2 * 3;
    //  a += 10 + 6
    //  a += 16
    //  20 += 16
    //  36



    }
}



/*

Precedence of all Operators ( öncelik sirasi)

1   - !                 Unary negation, logical NOT
2   * / %               Multiplication, division, modulus
3   + -                 Addition, subtraction
4   < > <= >=           Less than, Greater than, Less than or Equal to,
Greater than or equal to
5   == !=               Equal to, not equal to
6   &&                  Logical AND
7   ||                  Logical OR
8   = += -= *= /= %=    Assignment and combined assignments

 */