package com.conditionalsandloops;

import java.util.Scanner;

public class FibonacciFullScope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        System.out.print(a + ",");
//        for(int i = 1; i < n; i++){
//            int prev = b;
//            b += a;
//            a = prev;
//            if(i == n - 1) {
//                System.out.print(b);
//            } else {
//                System.out.print(b + ",");
//            }
//
//        }
        int count = 2;
        while(count <= n) {
            int prev = b;
            b += a;
            a = prev;
            if(count == n){
                System.out.print(b);
            } else {
                System.out.print(b + ",");
            }
            count++;
        }
    }
}
