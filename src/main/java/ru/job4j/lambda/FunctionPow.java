package ru.job4j.lambda;

import java.util.function.Function;

public class FunctionPow {

    public static double calculate(double x) {
        Function<Double, Double> fun = s -> Math.pow(s, 2);
        return fun.apply(x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }

}