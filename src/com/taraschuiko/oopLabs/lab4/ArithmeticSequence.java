package com.taraschuiko.oopLabs.lab4;

public class ArithmeticSequence extends Sequence {
    private int start;
    private int step;

    public ArithmeticSequence(int start, int step, int size) {
        super();
        this.start = start;
        this.step = step;
        this.size = size;
        this.values = new int[size];
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public Integer getValue(int index) {
        calculateSequence();
        return values[index - 1];
    }

    public int calculateSum() {
        calculateSequence();
        int sum = 0;
        for (int value: values) {
            sum += value;
        }
        return sum;
    }

    private void calculateSequence() {
        for (int i = 0, n = 1; i < size; i++, n++) {
            values[i] = start + (n - 1) * step;
        }
    }
}
