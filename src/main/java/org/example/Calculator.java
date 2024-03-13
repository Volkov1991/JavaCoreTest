package org.example;

import java.util.function.*;

import static java.lang.System.out;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = Calculator::apply;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> (x > 0) ? x : (x * -1);
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = out::println;


    public static Integer apply(Integer x, Integer y) {
        if (y != 0) {
            return x / y;
        } else { return y; }

    }

    public boolean evenOnNot(int number) {
        return number % 2 == 0;
    }


}