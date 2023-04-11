package java_programming.day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {


    public static void main(String[] args) {


        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/y, EEEE"); //datetime formatter --> df (formatting the date)
        LocalDate today = LocalDate.now();

        System.out.println(today.format(df)); // Apr/11/2023, Tuesday

        LocalDate date1 = LocalDate.of(2022,7,1);

        System.out.println(date1.format(df));// formatted as like as the above Jul/01/2022, Friday


/*
        Dates:
      * "y" --> 4 digit number year / 2023
      * "yy" --> 2 digit number year / 23
      * "M" --> Months number / 4
      * "MM" --> Months number (Includes 0 for number of 0 ~ 9) /04
      * "MMM" --> Month abbreviation (Jan, Feb, Mar… etc.) /Apr
      * "MMMM" -->Month name (January, February, March… etc.) /April
      * "d" --> Day number /11
      * "dd" --> Day number (Includes 0 for number of 0 ~ 9) /11
      * "E" --> Day name (Monday, Tuesday… etc.) / Tuesday
      * "EEE" --> Days of week abbreviation (Mon, Tue… etc.) /Tue
      * "y MMMM dd" --> 2023 April 11
      * "y/MMMM/dd" --> 2023/April/11
      * "MMMM-dd-yy" --> April-11-23  we can replace the pattern of the date
      * "MMMM-dd-yy, EEEE" --> April-11-23, Tuesday  adding the week of the name
      * "MMMM-dd-yy, E" --> April-11-23, Tue  adding the week of the name
      * "EEEE, MM/dd/y" --> Tuesday, 04/11/2023  adding the week of the name
        */

        System.out.println("\n..............................");


        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");


        LocalTime time1 = LocalTime.of(7,5);

        System.out.println(time1.format(tf)); // 07:05 AM



        /*
      Hours
      * "H" --> 24-hour format
      * "HH" --> 24-hour format (Includes 0 for number of 0 ~ 9)
      * "h" --> 12-hour format
      * "hh --> 12-hour format (Includes 0 for number of 0 ~ 9)
      * "m" --> Minute format
      * "mm" --> Minute format (Includes 0 for number of 0 ~ 9)
      * "s" --> Second format
      * "ss" --> Second format (Includes 0 for number of 0 ~ 9)

 */


        System.out.println("\n..............................");



        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MM/dd/y  hh:mm a");
        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf)); // 04/11/2023  07:26 AM







    }
}
