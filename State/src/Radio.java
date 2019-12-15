public class Radio {
    Station station;

    public void setStation(Station station) {
        this.station = station;
    }
    public void play() {
        station.play();
    }
    public void nextStation() {
        if (station instanceof RadioRock) {
            station = new RockFM();
        }
        else {
            station = new RadioRock();
        }
    }
}
