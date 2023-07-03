package com.conditionalsandloops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("What operation do you wish to perform? ");
        System.out.println("Operator Symbols: Addition = (+), Subtraction = (-), Multiplication = (*), Division = (/), Remainder = (%)");
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x

        int result = 0;

        while (true) {
            String resultTag = "";
            String midCatcher = "";
            //operator
            System.out.println();
            System.out.print("Operator: ");

            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //inputs
                System.out.print("Value 1: ");
                int num1 = in.nextInt();
                System.out.print("Value 2: ");
                int num2 = in.nextInt();
                System.out.println();
                //Processes
                if(op == '+'){
                    midCatcher = "added to";
                    result = num1 + num2;
                    resultTag = "Sum";
                }
                if(op == '-'){
                    midCatcher = "subtracted to";
                    result = num1 - num2;
                    resultTag = "Difference";
                }
                if(op == '*'){
                    midCatcher = "multiplied by";
                    result = num1 * num2;
                    resultTag = "Product";
                }
                if(op == '/') {
                    midCatcher = "divided by";
                    if(num2 != 0){
                        result = num1 / num2;
                        resultTag = "Quotient";
                    } else{
                        System.out.println("Nothing to divide!");
                        continue;
                    }
                }
                if (op == '%'){
                    midCatcher = "modulo to ";
                    result = num1 % num2;
                    resultTag = "Remainder";
                }

                System.out.println(num1 + " " + midCatcher + " " +  num2);
                System.out.println(resultTag + " value is: " + result);

            } else if(op == 'x' || op == 'X') {
                System.out.println("Thank you for using my program 🥳");
                break;
            } else{
                System.out.println("Invalid Operator");
            }
        }

    }

}
