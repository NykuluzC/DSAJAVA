package com.irven;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input 1
        System.out.print("Please enter your rollno value: ");
        Pattern p = Pattern.compile("[\\d]{2,}+[-?]{1,1}+[\\d]{1,}+[-?]{1,1}+[\\d]{5,}");
        String rollno = input.nextLine();
        Matcher m = p.matcher(rollno);
        if (!m.matches()){
            System.out.println("Invalid Format");
            return;
        }
        //Input 2
        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.print("Please enter your marks: ");
        double marks = input.nextDouble();
        input.nextLine();

        System.out.print("Subject Teacher: ");
        String teacher = input.nextLine();

        System.out.println("Your name is " +
                name + " and your rollno is: " + rollno + "."
                + "\nThat corresponds to a mark of: " + marks
                + "\nThe teacher of this subject is: " + teacher);
    }
}

//int,byte,long,float,double,char,boolean