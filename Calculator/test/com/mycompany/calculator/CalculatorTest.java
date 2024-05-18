/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculator;

import com.mycompany.calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author khoza
 */
public class CalculatorTest {

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
}