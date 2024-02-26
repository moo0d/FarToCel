package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitCalculatorTest {

    @Test
    public void testFahrenheitToCelsius() {
        FahrenheitCalculator fahrenheitCalculator = new FahrenheitCalculator();
        assertEquals(-17.222, fahrenheitCalculator.fahrenheitToCelsius(1), 0.001);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        FahrenheitCalculator fahrenheitCalculator = new FahrenheitCalculator();
        assertEquals(33.8, fahrenheitCalculator.celsiusToFahrenheit(1), 0.001);
    }

    @Test
    public void testKelvintoCel() {
        assertEquals(-273.15, FahrenheitCalculator.kelvintoCel(0), 0.001);
        assertEquals(-173.15, FahrenheitCalculator.kelvintoCel(100), 0.001);
    }

}