package com.taraschuiko.oopLabs.lab1;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();

        radio.turnOn();
        radio.setStation("NRJ", 98.5);
        radio.increaseVolume();

        System.out.println(radio.getVolume());

        System.out.println(radio.isTurnedOn());
        System.out.println(radio.getStationName());
        System.out.println(radio.getFrequency());

        radio.increaseFrequency();
        radio.increaseFrequency();
        radio.decreaseFrequency();
        radio.foundStation("Lux FM");

        radio.decreaseVolume();

        System.out.println(radio.getVolume());

        radio.turnOff();

        System.out.println(radio.isTurnedOn());
    }
}
