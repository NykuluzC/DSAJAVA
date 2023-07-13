package com.methods;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapNumber(a,b);
    }

    static void swapNumber(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
