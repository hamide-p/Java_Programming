package java_programming.day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {

        // import from java.time
        // it's immutable

        LocalTime starting_time = LocalTime.of(10, 30); // you can give another arguments also such as second

        System.out.println(starting_time); // 10:30

        LocalTime right_now = LocalTime.now(); // current time --> get from your computer local time

        System.out.println(right_now);// 10:23:55.095638

        System.out.println("\n..............................");

        LocalTime time1 = LocalTime.of(23, 59, 59); // 0 ~ 23 hours = size is 24--> when you give greater number (24,60,60) you will get DateTimeException

        System.out.println(time1); // 23:59:59

        time1 = time1.plusHours(1); // after 1 hour later

        System.out.println(time1); // 00:59:59

        time1 = time1.plusMinutes(45); // after 45 minutes later

        System.out.println(time1); // 01:44:59


    }
}
