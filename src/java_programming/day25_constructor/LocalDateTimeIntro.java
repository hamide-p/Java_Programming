package java_programming.day25_constructor;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {

    public static void main(String[] args) {


        // Combination of LocalDate and LocalTime
        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);

        LocalDateTime ends =  LocalDateTime.of(2023,5,18,11,0); // provide valid elements or you'll get datetime exception

        System.out.println(ends);

        System.out.println(starts.getDayOfWeek()); // current day-MONDAY

        System.out.println(starts.getHour());// 23

    }
}
