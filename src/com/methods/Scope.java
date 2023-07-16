package com.methods;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            a = 78; // initialized outside the block in the same method, hence you cannot initialize again
            int c = 99;
        }
        System.out.println(a);
        //System.out.println(c); // cannot use outside the block
        // values initialized in this block, will remain in the block



        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;

            System.out.println(num);
        }
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
    }


    
}
