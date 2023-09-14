package ru.zorro.app2;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

public class TestApp2 {

    public static void main(String[] args) {
        System.out.println("\n------\nstart TestApp2\n");
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        System.out.println("currentDate: " + currentDate);
        System.out.println("currentTime: " + currentTime);
        System.out.println("\nstop TestApp2\n------\n");
    }

}
