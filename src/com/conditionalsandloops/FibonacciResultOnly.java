package com.conditionalsandloops;

import java.util.Scanner;

public class FibonacciResultOnly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a value: ");
        int a = in.nextInt();
        System.out.print("b value: ");
        int b = in.nextInt();
        System.out.print("c value: ");
        int n = in.nextInt();

        int count = 2;

        while(count <= n){
            int temp = b;
            b += a;
            a = temp;
            count++;
        }
        String suffix;
        switch (n){
            case 1: suffix = "st";
                break;
            case 2: suffix = "nd";
                break;
            case 3: suffix = "rd";
                break;
            default: suffix = "th";
        }
        System.out.println(n + suffix + " fibonnaci: " + b);
    }
}
