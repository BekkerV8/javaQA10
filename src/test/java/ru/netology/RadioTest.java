package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    Radio station = new Radio(10);

    @Test
    public void shouldSetNumberOfStations() {
        Radio station = new Radio();
        station.setNumberOfStations(10);

        int expected = 10;
        int actual = station.getNumberOfStations();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberOfStationsUnderAmount() {
        Radio station = new Radio();
        station.setNumberOfStations(-1);

        int expected = 10;
        int actual = station.getNumberOfStations();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnNine() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnZero() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnFive() {
        Radio station = new Radio();
        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnOne() {
        Radio station = new Radio();
        station.setCurrentStation(1);

        int expected = 1;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnLessStation() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnTen() {
        Radio station = new Radio();
        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningStationOnNext() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        station.increaseStation();

        int expected = 6;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnTenByNext() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.increaseStation();

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningStationOnPrev() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        station.decreaseStation();

        int expected = 4;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnZeroToOneByNext() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.increaseStation();

        int expected = 1;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationFromZeroByPrev() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.decreaseStation();

        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurningOnOneHundred() {
        Radio station = new Radio();
        station.setCurrentVolume(100);

        int expected = 100;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurningOnNinetyNine() {
        Radio station = new Radio();
        station.setCurrentVolume(99);

        int expected = 99;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurningOnZero() {
        Radio station = new Radio();
        station.setCurrentVolume(0);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldVolumeTurningOnOne() {
        Radio station = new Radio();
        station.setCurrentVolume(1);

        int expected = 1;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurningOnZeroZero() {
        Radio station = new Radio();
        station.setCurrentVolume(0);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurningOnOneHundredAndOne() {
        Radio station = new Radio();
        station.setCurrentVolume(101);

        int expected = 100;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldVolumeTurningOnOneHundredByNext() {
        Radio station = new Radio();
        station.setCurrentVolume(99);
        station.increaseVolume();

        int expected = 100;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurningOnNinetyNineByPrev() {
        Radio station = new Radio();
        station.setCurrentVolume(100);
        station.decreaseVolume();

        int expected = 99;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurningOnOneHundredAndOneByNext() {
        Radio station = new Radio();
        station.setCurrentVolume(101);
        station.increaseVolume();

        int expected = 100;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurningOnOneByNext() {
        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.increaseVolume();

        int expected = 1;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldVolumeFromZeroByPrev() {
        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.decreaseVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurningOnZeroByPrev() {
        Radio station = new Radio();
        station.setCurrentVolume(1);
        station.decreaseVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeUnderMin() {
        Radio station = new Radio();
        station.setCurrentVolume(-1);
        station.decreaseVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

}