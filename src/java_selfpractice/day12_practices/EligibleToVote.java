package java_selfpractice.day12_practices;

public class EligibleToVote {

    public static void main(String[] args) {

        eligibleToVote(13,true);

    }

    public static void eligibleToVote (int age , boolean isAmerican){

        if (age >= 21 ){
            if( isAmerican == true){
                System.out.println("You are eligible to vote");
            }
        }



    }
}
/*
Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote

 */