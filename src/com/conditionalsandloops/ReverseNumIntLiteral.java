package com.conditionalsandloops;

public class ReverseNumIntLiteral {
    public static void main(String[] args) {
        int n = 23597;
        String formated = "";

        while(n > 0) {
            int r = n % 10;
            n /= 10;
            formated += String.valueOf(r);
        }
        int result = Integer.valueOf(formated);
        System.out.println(result);
    }

}
