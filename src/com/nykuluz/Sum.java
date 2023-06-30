package com.nykuluz;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Value 1: ");
        int value1 = input.nextInt();
        System.out.print("Value 2: ");
        int value2 = input.nextInt();

        int sum = value1 += value2;

        System.out.println("The total sum is: " + sum);
    }
}
