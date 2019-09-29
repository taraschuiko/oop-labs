package com.taraschuiko.oopLabs.lab2;

public class Main {
    public static void main(String[] args) {
//        1
        Radio2 radio21 = new Radio2();
        System.out.println(radio21.toString());

        Radio2 radio22 = new Radio2(true, 90, "NRJ", 3);
        System.out.println(radio22.toString());

        Radio2 radio23 = new Radio2(radio22);
        System.out.println(radio23.toString());

//        2
        FileAnalyzer fileAnalyzer = new FileAnalyzer("./lab2.txt");

        System.out.println(fileAnalyzer.hasChain("chain"));
        System.out.println(fileAnalyzer.numberOfChains("chain"));
    }
}
