package com.taraschuiko.oopLabs.lab5;

public class Main {
    public static void main(String[] args) {
//        1
        ArithmeticSequence arithmeticSequence = new ArithmeticSequence(1, 4, 10);
        arithmeticSequence.setSize(15);

        System.out.println(arithmeticSequence.getValue(1));
        System.out.println(arithmeticSequence.getValue(4));
        System.out.println(arithmeticSequence.getValue(9));
        System.out.println(arithmeticSequence.getValue(15));

        System.out.println(arithmeticSequence.calculateSum());

//        2
        FibonacciSequence fibonacciSequence = new FibonacciSequence(6);

        System.out.println(fibonacciSequence.getValue(1));
        System.out.println(fibonacciSequence.getValue(3));
        System.out.println(fibonacciSequence.getValue(6));

        System.out.println(fibonacciSequence.getRatio(3));
    }
}
