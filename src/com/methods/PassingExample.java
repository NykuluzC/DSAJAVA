package com.methods;

public class PassingExample {
    public static void main(String[] args){
        String name = "Iron Man";
        greet(name);
        //Input to parameters does not necessarily need to have the same name with the passed variable name inside the method
    }
    private static void greet(String nanme) {
        System.out.println(nanme);
    }
}
