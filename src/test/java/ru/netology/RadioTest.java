package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldUpStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.upStation();
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(3);
        radio.upStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldDownStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.downStation();
        assertEquals(9, radio.getCurrentStation());

        radio.setCurrentStation(6);
        radio.downStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.upVolume();
        assertEquals(4, radio.getCurrentVolume());

        radio.setCurrentVolume(10);
        radio.upVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.downVolume();
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(4);
        radio.downVolume();
        assertEquals(3, radio.getCurrentVolume());
    }
}