package java_selfpractice.day08_practices;

public class CydeoBatches {

    public static void main(String[] args) {


        System.out.println("Solution 1:");

        String batchType = "EU";


        if (batchType == "US morning" || batchType == "US evening" || batchType == "EU") {


            if (batchType == "US morning") {
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");

            } else if (batchType == "US evening") {
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");

            } else if (batchType == "EU") {
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");

            } else {
                System.out.println("Invalid Batch");
            }
        }


        System.out.println("\t............................");
        System.out.println("Solution 2:");


        switch (batchType) {


            case "US morning":
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                break;

            case "US evening":
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                break;
            case "EU":
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
                break;
            default:
                System.out.println("Invalid Batch");


        }


        System.out.println("\t............................");
        System.out.println("Solution 3:");


        if (batchType == "US morning" || batchType == "US evening" || batchType == "EU") {

            switch (batchType) {

                case "US morning":
                    System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                    break;

                case "US evening":
                    System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                    break;

                case "EU":
                    System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
                    break;

                default:
                    System.out.println("Invalid Batch");
                }

        } else {
            System.out.println("Invalid Batch");
        }




    }
    }







/*
10. Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Batch"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */