package com.mycompany.calculator;

import com.mycompany.calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddPositiveNumbers() {
        double num1 = 5.0;
        double num2 = 3.0;
        double expected = 8.0;
        double result = Calculator.add(num1, num2);
        assertEquals(expected, result, 0.0001); // delta added for double comparison
    }

    @Test
    public void testAddNegativeNumbers() {
        double num1 = -5.0;
        double num2 = -3.0;
        double expected = -8.0;
        double result = Calculator.add(num1, num2);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testAddPositiveAndNegativeNumbers() {
        double num1 = 5.0;
        double num2 = -3.0;
        double expected = 2.0;
        double result = Calculator.add(num1, num2);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testAddZero() {
        double num1 = 5.0;
        double num2 = 0.0;
        double expected = 5.0;
        double result = Calculator.add(num1, num2);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testAddZeroToZero() {
        double num1 = 0.0;
        double num2 = 0.0;
        double expected = 0.0;
        double result = Calculator.add(num1, num2);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void multiplyPostive() {
        // Normal Multiplaction
        double num1 = 10;
        double num2 = 2;
        double expected = 20;
        double result = Calculator.multiply(num1, num2);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void multiplyZero() {
        // Multiply by zero
        double num1 = 10;
        double num2 = 0;
        double expected = 0;
        double result = Calculator.multiply(num1, num2);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void multiplyZeroToZero() {
        // Multiply zero by zero
        double num1 = 0;
        double num2 = 0;
        double expected = 0;
        double result = Calculator.multiply(num1, num2);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void multiplyNegative() {
        // Multiply of a Negative Number
        double num1 = -5;
        double num2 = 3;
        double expected = -15;
        double result = Calculator.multiply(num1, num2);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void divideNormal() {
        // Normal Division
        double num1 = 10;
        double num2 = 2;
        double expected = 5.0;
        double result = Calculator.divide(num1, num2);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void divideByZero() {
        // Division by zero
        double num1 = 10;
        double num2 = 0;
        double expected = Double.NaN;
        double result = Calculator.divide(num1, num2);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void divideFraction() {
        // Division Resulting in a Fraction
        double num1 = 3;
        double num2 = 4;
        double expected = 0.75;
        double result = Calculator.divide(num1, num2);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void divideNegative() {
        // Division of a Negative Number
        double num1 = -15;
        double num2 = 3;
        double expected = -5.0;
        double result = Calculator.divide(num1, num2);
        assertEquals(expected, result, 0.0001);
    }

}
