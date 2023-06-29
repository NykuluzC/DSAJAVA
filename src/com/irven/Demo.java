package com.irven;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some integer value: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is: " + rollno);
    }
}

//int,byte,long,float,double,char,boolean