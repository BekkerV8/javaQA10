package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldTurningStationOnNine() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningStationOnZero() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningStationOn10() {
        Radio station = new Radio();
        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningStationOnFive() {
        Radio station = new Radio();
        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldTurningStationOnMinusOne() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

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
    public void shouldTurningStationOnPrev() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        station.decreaseStation();

        int expected = 4;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldTurningStationFromZeroByPrev() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.decreaseStation();

        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningStationOnTenByNext() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.increaseStation();

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnTen() {
        Radio station = new Radio();
        station.setCurrentVolume(10);

        int expected = 10;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeZero() {
        Radio station = new Radio();
        station.setCurrentVolume(0);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnNine() {
        Radio station = new Radio();
        station.setCurrentVolume(5);

        int expected = 5;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnOne() {
        Radio station = new Radio();
        station.setCurrentVolume(1);

        int expected = 1;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnEleven() {
        Radio station = new Radio();
        station.setCurrentVolume(11);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldTurningVolumeOnTenByNext() {
        Radio station = new Radio();
        station.setCurrentVolume(9);
        station.increaseVolume();

        int expected = 10;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnElevenByNext() {
        Radio station = new Radio();
        station.setCurrentVolume(10);
        station.increaseVolume();

        int expected = 10;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnOneByNext() {
        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.increaseVolume();

        int expected = 1;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnNineByPrev() {
        Radio station = new Radio();
        station.setCurrentVolume(10);
        station.decreaseVolume();

        int expected = 9;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldTurningVolumeZeroByPrev() {
        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.decreaseVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnMinusOne() {
        Radio station = new Radio();
        station.setCurrentVolume(-1);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }
}