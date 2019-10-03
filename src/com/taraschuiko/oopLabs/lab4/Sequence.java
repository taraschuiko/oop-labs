package com.taraschuiko.oopLabs.lab4;

public class Sequence {
    protected int size;
    protected int[] values;

    public void setSize(int size) {
        this.size = size;
        this.values = new int[size];
    }
}
