public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time(int hour) {
        this(hour, 0, 0);
    }

    public Time inc() {
        this.second++;
        if (this.second == 60) {
            this.second = 0;
            this.minute++;
            if (this.minute == 60) {
                this.minute = 0;
                this.hour = (this.hour + 1) % 24;
            }
        }
        return this;
    }

    public int differenceInSeconds(Time other) {
        int thisTimeInSeconds = this.hour * 3600 + this.minute * 60 + this.second;
        int otherTimeInSeconds = other.hour * 3600 + other.minute * 60 + other.second;
        return Math.abs(thisTimeInSeconds - otherTimeInSeconds);
    }
}
