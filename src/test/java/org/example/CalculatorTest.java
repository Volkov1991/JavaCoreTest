package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator = Calculator.instance.get();
    @Test
    public void plusTest() {
        int result = calculator.plus.apply(6, 4);
        Assertions.assertEquals(10, result);
    }
    @Test
    public void minusTest() {
        int result = calculator.minus.apply(12, 3);
        Assertions.assertEquals(4, result);
    }
    @Test
    void evenOnNotTest() {
        boolean result = calculator.evenOnNot(6);
        Assertions.assertTrue(result);
    }
    @Test
    void divideByZeroTest() {
        int result = calculator.apply(4, 0);
        Assertions.assertEquals(0, result);
    }



}