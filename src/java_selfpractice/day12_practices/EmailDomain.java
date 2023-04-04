package java_selfpractice.day12_practices;

public class EmailDomain {

    public static void main(String[] args) {

   emailDomain("Cydeo@hotmail.com");

    }

    public static void emailDomain(String email){




        int beginning = email.indexOf("@") + 1;

        int ending = email.lastIndexOf('.');

        String domain =  email.substring(beginning, ending);

        System.out.println(domain);


    }














}
/*
Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */