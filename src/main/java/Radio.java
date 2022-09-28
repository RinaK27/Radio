public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int radioStationAmount;

    public Radio() {
        radioStationAmount = 10;
    }

    public Radio(int radioStationAmount) {
        this.radioStationAmount = radioStationAmount;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int CurrentRadioStation) {
        if (CurrentRadioStation > radioStationAmount - 1) {
            return;
        }
        if (CurrentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = CurrentRadioStation;
    }

    public void next() {
        if (currentRadioStation == radioStationAmount - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = radioStationAmount - 1;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setCurrentVolume(int CurrentVolume) {
        this.currentVolume = CurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void deincreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}