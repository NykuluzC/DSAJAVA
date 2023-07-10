package com.methods;

import java.util.Scanner;

public class Main {
    // Q: take input of 2 numbers and print the sum
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;

        System.out.print("Number 1: ");
        num1 = in.nextInt();
        System.out.print("Number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;

        System.out.println("The sum = " + sum);



    }



}
