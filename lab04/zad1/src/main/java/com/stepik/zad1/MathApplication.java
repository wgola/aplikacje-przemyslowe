package com.stepik.zad1;

import org.springframework.stereotype.Component;

@Component
public class MathApplication {

    private final Calculator calculator;

    public MathApplication(Calculator calculator) {
        this.calculator = calculator;
    }

    public int performAdd(int a, int b) {
        return calculator.add(a, b);
    }

    public int performSubstract(int a, int b) {
        return calculator.substract(a, b);
    }

    public int performMultiply(int a, int b) {
        return calculator.multiply(a, b);
    }

    public int performDivide(int a, int b) {
        return calculator.divide(a, b);
    }
}
