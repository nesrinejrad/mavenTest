package model;

public class RaceResults {
    private String rfid;
    private TimeDuration raceTime;

    public RaceResults(String rfid, TimeDuration timeDuration) {
        this.rfid = rfid;
        this.raceTime = timeDuration;
    }
}
