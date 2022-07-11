package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberOfStations = 10;

    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void setNumberOfStations(int numberOfStations) {
        if (numberOfStations < 0) {
            return;
        }
        this.numberOfStations = numberOfStations;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = numberOfStations - 1;
        }
        if (currentStation > numberOfStations - 1) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseStation() {
        if (currentStation < numberOfStations - 1) {
            currentStation = currentStation + 1;
        } else currentStation = 0;
    }

    public void decreaseStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else currentStation = numberOfStations - 1;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }


}