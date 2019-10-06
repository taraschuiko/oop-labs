package com.taraschuiko.oopLabs.lab5;

public class FibonacciSequence extends Sequence {
    public FibonacciSequence(int size) {
        super();
        this.size = size;
        this.values = new int[size];
    }

    @Override
    public int getValue(int index) {
        calculateSequence();
        return values[index - 1];
    }

    public String getRatio(int index) {
        calculateSequence();
        String ratio = "";
        ratio += values[index - 1] + " / " + values[index - 2];
        return ratio;
    }

    private void calculateSequence() {
        values[0] = 1;
        values[1] = 1;
        for (int i = 2; i < size; i++) {
            values[i] = values[i - 1] + values[i - 2];
        }
    }
}
