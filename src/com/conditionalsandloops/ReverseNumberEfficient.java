package com.conditionalsandloops;

import java.util.Scanner;

public class ReverseNumberEfficient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int answer = 0;
        while(n > 0){
            int r = n % 10;
            n /= 10;
            answer = answer * 10 + r;

        }
        System.out.println(answer);
    }
}
