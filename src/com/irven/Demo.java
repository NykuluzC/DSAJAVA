package com.irven;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input 1
        System.out.print("Please enter your rollno value: ");
        int rollno = input.nextInt();
        input.nextLine();

        //Input 2
        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.print("Please enter your marks: ");
        float marks = input.nextFloat();
        input.nextLine();

        System.out.print("Subject Teacher: ");
        String teacher = input.nextLine();

        System.out.println("Your name is " +
                name + " and your rollno is: " + rollno + "."
                + "\nThat corresponds to a mark of: " + marks + "."
                + "\nThe teacher of this subject is: " + teacher);
    }
}

//int,byte,long,float,double,char,boolean