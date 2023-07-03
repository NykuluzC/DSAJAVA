package com.conditionalsandloops;

public class ReoccuringDraftSol {
    public static void main(String[] args) {
        int n = 1385757879;
        String format;
        format = String.valueOf(n);

        int count = 0;
        for(int i = 0; i < format.length(); i ++){
           if(format.charAt(i) == '7'){
               count++;
           }
        }
        System.out.println(count);
    }
}
