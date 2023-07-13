package com.methods;

import java.util.Scanner;

public class WeatherCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the weather today: ");
        String weather = in.next();

        switch(weather.toLowerCase()){
            case "sunny" -> System.out.println("It is sunny today, wear an open outfit!");
            case "rainy" -> System.out.println("It is rainy today, bring your umbrella!");
            case "cloudy" -> System.out.println("It is cloudy today, wear your sweater!");
            default -> System.out.println("Not a valid weather");

        }
    }
}

