package com.conditionalsandloops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        */

        //Print Number 1 to 5
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        //Print 5 Hello World
        for(int z = 0; z < 5; z++){
            System.out.println("Hello World!");
        }
        //For loop with Scanner
        Scanner s = new Scanner(System.in);
        System.out.print("Itterate until: ");
        int max = s.nextInt();

        for(int y = 1; y <= max; y++){
            System.out.println(y);
        }

        // While loops

        //regular while
        int whileNum = 1;
        while(whileNum <= 5){
            System.out.println(whileNum);
            whileNum ++;
        }

        //do-while loop

        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while(n <= 5);
    }
}
