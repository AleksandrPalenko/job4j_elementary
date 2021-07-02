package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.multiply;
import static ru.job4j.math.MathFunction.sum;
import static ru.job4j.math.MathFunction.dif;
import static ru.job4j.math.MathFunction.division;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double difAndDivision(double first, double second) {
        return dif(first, second)
                + division(first, second);
    }

    public static double sumAllMathFunction(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + dif(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + difAndDivision(30, 20));
        System.out.println("Результат расчета равен: " + sumAllMathFunction(10, 10));
    }
}
