package java_selfpractice.day31_practices.states;

public class StateObjects {

    public static void main(String[] args) {


        /*
        3. Create a class named StateObjects
                    Create the objects of each subclasses

                    test all the functions of each objects

                    Analyze the relationships between the classes
*/
        California california = new California("California", "CA", "Democrat", "Gavin Christopher Newsom ", "Dianne Feinstein", 39.24, 7.25);

        Florida florida = new Florida("Florida", "FL", "Republican", "Ron DeSantis", "Rick Scott", 21.78, 6);

        Texas texas = new Texas("Texas", "TX", "Republican", "Greg Abbott", "Ted Cruz", 29.53, 6.25);

        Virginia virginia = new Virginia("Virginia", "VA", "Republican", "Glenn Youngkin", "Mark Warner", 8.642, 5.3);


        System.out.println(california);
        System.out.println(florida);
        System.out.println(texas);
        System.out.println(virginia);

        System.out.println("................");


        florida.getPopulation();
        texas.setAbbreviation("tx");
        System.out.println(virginia.getSenator());


    }
}
