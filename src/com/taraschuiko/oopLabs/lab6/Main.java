package com.taraschuiko.oopLabs.lab6;

public class Main {
    public static void main(String[] args) {
        FileAnalyzer<String> fileAnalyzerString = new FileAnalyzer<>("./lab6.txt", "chain");

        System.out.println(fileAnalyzerString.hasChain());
        System.out.println(fileAnalyzerString.numberOfChains());

        FileAnalyzer<Integer> fileAnalyzerInteger = new FileAnalyzer<>("./lab6.txt", 123);

        System.out.println(fileAnalyzerInteger.hasChain());
        System.out.println(fileAnalyzerInteger.numberOfChains());
    }
}
