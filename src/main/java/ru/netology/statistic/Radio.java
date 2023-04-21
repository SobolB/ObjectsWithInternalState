package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;


    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
        }
        if (currentStation > maxStation) {
        }
        this.currentStation = currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
        }
        if (currentVolume > 10) {
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
