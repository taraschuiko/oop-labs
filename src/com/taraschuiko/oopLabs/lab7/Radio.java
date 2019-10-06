package com.taraschuiko.oopLabs.lab7;

public class Radio {
    private boolean turnedOn;
    private double frequency;
    private String stationName;
    private int volume;
    private int previousVolume;

    public Radio() {
        this.turnedOn = false;
        this.frequency = 88;
        this.stationName = null;
        this.volume = 0;
        this.previousVolume = 0;
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
        try {
            if (frequency > 88 && frequency < 108) {
                this.stationName = stationName;
                this.frequency = frequency;
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Станція не існує");
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
}
