import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void shouldSetCurrentRadioStationAboveLimit() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationUnderLimit() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNext() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNext2() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);
        rad.next();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationPrev() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationPrev2() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);
        rad.prev();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(7);
        vol.increaseVolume();
        int expected = 8;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume2() {
        Radio vol = new Radio();
        vol.setCurrentVolume(100);
        vol.increaseVolume();
        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDeincreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(7);
        vol.deincreaseVolume();
        int expected = 6;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDeincreaseVolumeToMin() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);
        vol.deincreaseVolume();
        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNewNext() {
        Radio rad = new Radio(15);
        rad.setCurrentRadioStation(9);
        rad.next();
        int expected = 10;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}