package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldStationNine() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationZero() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTen() {
        Radio station = new Radio();
        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationFive() {
        Radio station = new Radio();
        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldStationMinusOne() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNext() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        station.upStation();

        int expected = 6;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldStationPrev() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        station.downStation();

        int expected = 4;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldStationFromZero() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.downStation();

        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationOnTenNext() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.upStation();

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTen() {
        Radio station = new Radio();
        station.setCurrentVolume(10);

        int expected = 10;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeZero() {
        Radio station = new Radio();
        station.setCurrentVolume(0);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeNine() {
        Radio station = new Radio();
        station.setCurrentVolume(5);

        int expected = 5;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeOne() {
        Radio station = new Radio();
        station.setCurrentVolume(1);

        int expected = 1;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeEleven() {
        Radio station = new Radio();
        station.setCurrentVolume(11);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldVolumeTenNext() {
        Radio station = new Radio();
        station.setCurrentVolume(9);
        station.upVolume();

        int expected = 10;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeElevenNext() {
        Radio station = new Radio();
        station.setCurrentVolume(10);
        station.upVolume();

        int expected = 10;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeOneNext() {
        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.upVolume();

        int expected = 1;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeNinePrev() {
        Radio station = new Radio();
        station.setCurrentVolume(10);
        station.downVolume();

        int expected = 9;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldVolumeZeroPrev() {
        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.downVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMinus() {
        Radio station = new Radio();
        station.setCurrentVolume(-1);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }
}