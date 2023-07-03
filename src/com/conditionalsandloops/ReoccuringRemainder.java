package com.conditionalsandloops;

public class ReoccuringRemainder {

    public static void main(String[] args) {
        int n  = 1385757879;

        int r;
        int count = 0;

        while(n > 0){
            r = n % 10;
            if(r == 7){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
