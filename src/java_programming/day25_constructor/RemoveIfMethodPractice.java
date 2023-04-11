package java_programming.day25_constructor;

import java_programming.day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {

    public static void main(String[] args) {

        /*
        Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops

	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

	            Note: DO NOT use any loops

	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

	            Note: DO NOT use any loops

	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

	            Note: DO NOT use any loops
         */


        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");


        System.out.println("\n1.1...........................");

        ArrayList<Dog> smallDogs = new ArrayList<>();

        //old version
         /*    for (Dog dog : dogs) {

            if (dog.size.equalsIgnoreCase("small")){
                smallDogs.add(dog);
            }
        }
*/



        smallDogs.addAll(Arrays.asList(dogs));

        // condition: if the size of the dog doesn't equal to small
        smallDogs.removeIf(p-> !p.size.equalsIgnoreCase("small"));

        System.out.println(smallDogs);



        System.out.println("\n1.2...........................");

        ArrayList<Dog> youngDogs = new ArrayList<>();
        youngDogs.addAll(Arrays.asList(dogs));

        //old version
       /*  for (Dog dog : dogs) {

            if (dog.age <=4){
                youngDogs.add(dog);
            }
        }*/

        youngDogs.removeIf(p -> p.age >=4);

        System.out.println(youngDogs);


        System.out.println("\n1.3...........................");


        ArrayList<Dog> femaleDogs = new ArrayList<>();
        femaleDogs.addAll(Arrays.asList(dogs));


        femaleDogs.removeIf(p -> p.gender == 'M');

        System.out.println(femaleDogs);

        System.out.println("\n1.4...........................");
        ArrayList<Dog> maleDogs = new ArrayList<>();
        maleDogs.addAll(Arrays.asList(dogs));


       maleDogs.removeIf(p -> p.gender == 'F');

        System.out.println(maleDogs);



        System.out.println("\n..............................");

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");


        ArrayList<Dog> list = new ArrayList<>();
        list.addAll(Arrays.asList(dogs2));


        list.removeIf(p -> p.size.equalsIgnoreCase("small"));

        //convert ArrayList to the Array

      //  dogs2 = list.toArray(new Dog[0]); // don't give extra size number because you'll get null for the rest of the elements

        dogs2 = list.toArray(new Dog[list.size()]);


        System.out.println(Arrays.toString(dogs2));






    }
}
