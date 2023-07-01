package com.conditionalsandloops;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Salary: ");
        int salary = input.nextInt();
        if(salary <= 10000)
        {
            salary += 1000;
        } else if(salary <= 20000){
            salary += 2000;
        } else {
            salary += 3000;
        }
        System.out.println(salary);
    }
}
