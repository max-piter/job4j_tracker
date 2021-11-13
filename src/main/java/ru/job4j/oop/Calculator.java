package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int multiply(int y) {
        return y * x;
    }

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return multiply(y) + sum(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = Calculator.sum(10);
        System.out.println(result);
        calculator.divide(10);
        calculator.sumAllOperation(10);
        result = Calculator.minus(10);
        result = Calculator.multiply(10);
        System.out.println(result);
    }
}
