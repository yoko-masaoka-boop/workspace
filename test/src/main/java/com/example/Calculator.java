package com.example;

public class Calculator {
    private int result;

    public Calculator() {
        this.result = 0;
    }

    public void add(int a) {
        this.result = Calc.add(this.result, a);
    }

    public void subtract(int a) {
        this.result = Calc.subtract(this.result, a);
    }

    public void multiply(int a) {
        this.result = Calc.multiply(this.result, a);
    }

    public void divide(int a) {
        try {
            this.result = Calc.divide(this.result, a);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("division error", e);
        }
    }

    public int getResult() {
        return this.result;
    }

    public void reset() {
        this.result = 0;
    }
}