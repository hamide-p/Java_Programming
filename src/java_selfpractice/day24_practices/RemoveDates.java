package java_selfpractice.day24_practices;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDates {

    public static void main(String[] args) {

        /*
        create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016

         */

       ArrayList<LocalDate> dates = new ArrayList<>();


       dates.addAll(Arrays.asList(
               LocalDate.of(2019, 3, 12),
               LocalDate.of(2015, 8, 15),
               LocalDate.of(2012, 2, 11),
               LocalDate.of(2023, 4, 16),
               LocalDate.of(2000, 1, 12),
               LocalDate.of(2022, 5, 2),
               LocalDate.of(1987, 12, 22)));


       dates.removeIf(p-> p.isBefore(LocalDate.of(2015,8,15)));

        System.out.println(dates);


    }
}
