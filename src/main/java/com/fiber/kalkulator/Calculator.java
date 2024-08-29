package com.fiber.kalkulator;

public class Calculator {

    void addition(int a, int b) {
        int c = a + b;
    }

    void subtraction(int a, int b) {
        int c = a - b;
    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.addition(5, 8);
        calculator.subtraction(5, 8);
        System.out.println("It works!");

    }


}
