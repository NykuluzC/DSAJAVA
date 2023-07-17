package com.shadowing;

public class Shadowing {
    static int x; // this will be shadowed in line 40
    static int y;
    public static void main(String[] args){
        x += 5;

        System.out.println(x); // 5
        fun(); // 5
        int x  = 40; // the class variable at line 4 will be shadowed with this
        int y;
        System.out.println(x); // 40

    }


    static void fun(){
        System.out.println(x);
    }
}
