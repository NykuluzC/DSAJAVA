package com.irven;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();

        //type casting
        int numInt = (int)(num);
        System.out.println(numInt);

        // automatic type promition in expressions
        int a = 258;
        byte b = (byte) (a);
        System.out.println(b);
    }
}
