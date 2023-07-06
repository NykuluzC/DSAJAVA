package com.switchStatements;

import java.util.Scanner;

public class WeekdayOrWeekend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What day is it?");
        String day = in.next();

        switch (day.toLowerCase()) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("Weekdays!");
            case "saturday", "sunday" -> System.out.println("Weekends!");
            default -> System.out.println("Invalid Day!");
        }
    }
}
