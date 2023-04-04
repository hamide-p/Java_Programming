package java_selfpractice.day18_practices;

public class ContactTest {

    public static void main(String[] args) {


        Contact info = new Contact();

        info.setInfo("Azure", "azure@sky.com",1541647280);

        System.out.println(info);


        info.call();
        info.sendMessage();
        info.sendEmail();





    }
}
