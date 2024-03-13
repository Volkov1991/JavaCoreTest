package org.example;

import java.util.function.*;
public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.multiply.apply(4, b);
        int d = calc.devide.apply(a, b); // на ноль делить нельзя

        calc.println.accept(d);

    }

}