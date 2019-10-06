package com.taraschuiko.oopLabs.lab6;

public class Main {
    public static void main(String[] args) {
        FileAnalyzer fileAnalyzer = new FileAnalyzer("./lab2.txt");

        System.out.println(fileAnalyzer.hasChain("chain"));
        System.out.println(fileAnalyzer.numberOfChains("chain"));
    }
}
