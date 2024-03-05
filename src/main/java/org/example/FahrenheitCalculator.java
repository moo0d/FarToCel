package org.example;

public class FahrenheitCalculator {


    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static float kelvintoCel (float kel) {
        return (float) (kel - 273.15);

    }

    public double kelvinToFahrenheit(double kelvin) {
        return 1.8 * (kelvin - 273.15) + 32;
    }
}
