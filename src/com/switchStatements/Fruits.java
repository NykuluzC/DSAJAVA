package com.switchStatements;

import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What Fruit do you like? ");
        String fruit = in.next();

        switch(fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;

            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                break;
        }

    }
}
