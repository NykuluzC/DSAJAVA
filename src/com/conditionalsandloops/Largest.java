package com.conditionalsandloops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int max = Math.max(Math.max(a,b),c);

        System.out.println(max);
    }
}
