package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        calculator.reset();
    }

    @ParameterizedTest
    @CsvSource({
        "0, 5, 5",
        "5, 3, 8",
        "-5, -3, -8"
    })
    public void testAdd(int initial, int addValue, int expected) {
        calculator.add(initial);
        calculator.add(addValue);
        assertEquals(expected, calculator.getResult());
    }

    @ParameterizedTest
    @CsvSource({
        "10, 3, 7",
        "0, 5, -5",
        "-5, -5, 0"
    })
    public void testSubtract(int initial, int subValue, int expected) {
        calculator.add(initial);
        calculator.subtract(subValue);
        assertEquals(expected, calculator.getResult());
    }

    @ParameterizedTest
    @CsvSource({
        "1, 3, 3",
        "0, 5, 0",
        "-2, 3, -6"
    })
    public void testMultiply(int initial, int mulValue, int expected) {
        calculator.add(initial);
        calculator.multiply(mulValue);
        assertEquals(expected, calculator.getResult());
    }

    @ParameterizedTest
    @CsvSource({
        "10, 2, 5",
        "9, 3, 3",
        "-6, -3, 2"
    })
    public void testDivide(int initial, int divValue, int expected) {
        calculator.add(initial);
        calculator.divide(divValue);
        assertEquals(expected, calculator.getResult());
    }

    @Test
    public void testDivideByZero() {
        calculator.add(10);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(0);
        });
        assertEquals("division error", exception.getMessage());
    }

    @Test
    public void testComplexCalculation() {
        calculator.add(2);
        calculator.multiply(3);
        calculator.subtract(1);
        calculator.divide(2);
        assertEquals(2, calculator.getResult());
    }
}