package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
//        if (b == 0) throw new IllegalArgumentException("Divider cannot be zero.");
        return a / b; //flacoco catch { approx. 0.7 suspicious point}
    }
}
