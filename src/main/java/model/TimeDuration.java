package model;

import exception.BadBadValueException;

public class TimeDuration {
    private int numberOfSerconds;


    public TimeDuration(int numberOfSerconds) {
        if (numberOfSerconds > 0)
            this.numberOfSerconds = numberOfSerconds;
        else
            throw new BadBadValueException();
    }

    @Override
    public String toString() {
        int numberOfHours = numberOfSerconds / 3600;
        int numberOfMinutes = (numberOfSerconds % 3600) / 60;
        int numberOfSerconds = this.numberOfSerconds % 60;
        if (this.numberOfSerconds >= 3600)
            return numberOfHours + "h " + numberOfMinutes + "m " + numberOfSerconds + "s";

        else if (this.numberOfSerconds <= 60)
            return numberOfMinutes + "m " + numberOfSerconds + "s";
        else
            return numberOfSerconds + "s";
    }
}
