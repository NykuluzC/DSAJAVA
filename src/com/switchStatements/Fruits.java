package com.switchStatements;

import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What Fruit do you like? ");
        String fruit = in.next();
        switch (fruit.toLowerCase()) {
            case "mango" -> System.out.println("King of fruits 🥭");
            case "apple" -> System.out.println("A sweet red fruit 🍎");
            case "orange" -> System.out.println("Round fruit 🍊");
            case "grapes" -> System.out.println("Small fruit 🍇");
            default -> System.out.println("Please enter a valid fruit ⚠️");
        }

    }
}
