package com.shadowing;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(true,4,5,6,7,8,9,10);
        multiple(4,5,5,6);
    }

    static void fun(boolean flag,int ...v){
        System.out.println(Arrays.toString(v));
        for(int i = 0; i < v.length; i++){
            System.out.println(flag);
            System.out.println(v[i]);
        }
    }

    static void multiple(int x, int ...y){
        System.out.println(x);
        System.out.println(Arrays.toString(y));
    }

}
