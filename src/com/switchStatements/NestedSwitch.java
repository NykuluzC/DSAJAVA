package com.switchStatements;

import java.util.Scanner;
import java.util.SortedMap;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Employee Number: ");
        int empID = in.nextInt();
        System.out.print("Department: ");
        String department = in.next();

        switch (empID) {
            case 1 -> {
                switch (department.toLowerCase()) {
                    case "it" -> System.out.println("***IT Department***");
                    case "management" -> System.out.println("***Management Department***");
                    default -> System.out.println("***No department or unassigned***");
                }
                System.out.println("Carl Irven Nykuluz Millanes");
            }
            case 2 -> System.out.println("Ralph Rivera");
            case 3 -> System.out.println("Jose Hinolan");
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
