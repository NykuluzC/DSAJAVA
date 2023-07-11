package com.methods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String output = greet();
        System.out.println(output);



        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Greeting : ");
        String greeting = in.nextLine();

        String personalized = myGreet(greeting);
        System.out.println(personalized);
    }

    static String myGreet(String greet) {
        String message = "Hello, " + greet;
        return message;
    }

    static String greet(){
        return "Hello";
    }
}
