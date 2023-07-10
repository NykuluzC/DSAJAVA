package com.methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int result = sum3(3,4);
        System.out.println(result);
    }
    //sum with integer return type and 2 integer parameters
    static int sum3(int num1, int num2){
        Scanner in = new Scanner(System.in);
        return num1 + num2;
    }
    //sum with integer return type
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }

    //no return type
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.print("The sum = " + sum);

    }
}
