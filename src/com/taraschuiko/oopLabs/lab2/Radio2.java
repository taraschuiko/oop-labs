package com.taraschuiko.oopLabs.lab2;

public class Radio2 {
    private boolean turnedOn;
    private double frequency;
    private String stationName;
    private int volume;
    private int previousVolume;

    public Radio2() {
        this.turnedOn = false;
        this.frequency = 88;
        this.stationName = null;
        this.volume = 0;
        this.previousVolume = 0;
    }

    public Radio2(boolean turnedOn, double frequency, String stationName, int volume) {
        this.turnedOn = turnedOn;
        this.frequency = frequency;
        this.stationName = stationName;
        this.volume = volume;
        this.previousVolume = 0;
    }

    public Radio2(Radio2 radio) {
        this.turnedOn = radio.isTurnedOn();
        this.frequency = radio.getFrequency();
        this.stationName = radio.getStationName();
        this.volume = radio.getVolume();
        this.previousVolume = radio.getPreviousVolume();
    }

    public boolean turnOn() {
        this.turnedOn = true;
        this.volume = 5;
        this.frequency = 88;
        return true;
    }

    public boolean turnOff() {
        this.turnedOn = false;
        this.volume = 0;
        return true;
    }

    public boolean increaseVolume() {
        if (volume < 10) {
            this.volume++;
            return true;
        } else {
            return false;
        }
    }

    public boolean decreaseVolume() {
        if (volume > 0) {
            this.volume--;
            return true;
        } else {
            return false;
        }
    }


    public boolean setStation(String stationName, double frequency) {
        if (frequency > 88 && frequency < 108) {
            this.stationName = stationName;
            this.frequency = frequency;
            return true;
        } else {
            return false;
        }
    }

    public boolean increaseFrequency() {
        if (this.frequency < 108) {
            if (this.volume != 0) {
                this.previousVolume = this.volume;
            }
            this.volume = 0;
            this.stationName = null;
            this.frequency += 0.5;
            return true;
        } else {
            return false;
        }
    }

    public boolean decreaseFrequency() {
        if (this.frequency > 88) {
            if (this.volume != 0) {
                this.previousVolume = this.volume;
            }
            this.volume = 0;
            this.stationName = null;
            this.frequency -= 0.5;
            return true;
        } else {
            return false;
        }
    }

    public boolean foundStation(String stationName) {
        this.volume = this.previousVolume;
        this.stationName = stationName;
        System.out.println("Station: " + this.stationName);
        return true;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public double getFrequency() {
        return frequency;
    }

    public String getStationName() {
        return stationName;
    }

    public int getVolume() {
        return volume;
    }

    public int getPreviousVolume() {
        return previousVolume;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "turnedOn=" + turnedOn +
                ", frequency=" + frequency +
                ", stationName='" + stationName + '\'' +
                ", volume=" + volume +
                ", previousVolume=" + previousVolume +
                '}';
    }
}
