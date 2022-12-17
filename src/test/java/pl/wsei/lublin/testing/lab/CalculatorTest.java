package pl.wsei.lublin.testing.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAdd3()
    {
        assertEquals(4, Calculator.add(2, 2));
    }
    @Test
    void testMultiply() {
        assertAll(
                () -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4,Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }

    @Test
    void testSubtract() {
        assertEquals(6, Calculator.subtract(8, 2));

    }

    @Test
    void divide() {
        assertEquals(4, Calculator.divide(8, 2));
    }
}