package com.switchStatements;

import java.util.Scanner;

public class WeekdayOrWeekend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What day is it?");
        String day = in.next();

        switch(day.toLowerCase()){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Weekdays!");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Weekends!");
                break;
            default:
                System.out.println("Invalid Day!");
        }
    }
}
