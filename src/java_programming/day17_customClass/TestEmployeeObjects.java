package java_programming.day17_customClass;

public class TestEmployeeObjects {


    public static void main(String[] args) {


       Employee employee1 = new Employee();
       employee1.setInfo("Sumeye", 28, 'F', "Java Developer", 95000, "A12" );


       Employee employee2 = new Employee();
       employee2.setInfo("Khashavar", 29, 'M', "Back-end Developer", 98000, "B13");

       Employee employee3 = new Employee();
       employee3.setInfo("Abidulah", 30, 'M', "Front-end Developer", 99000, "C14");


       employee1.age = 39; // when u want to change the age u can call like this
        employee3.name = "Lucy";
        employee2.gender = 'F';



        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);


        employee1.work();
        employee2.work();
        employee3.work();






    }
}
