public class TimeCreator {
    public static Time setTime(int hour, int minute, int second ) {
        return new Time(hour, minute, second);
    }

    public static Time setTime(int hour, int minute) {
        return new Time(hour, minute);
    }

    public static Time setTime(int hour) {
        return new Time(hour);
    }

    public static void main(String[] args) {
        Time time1 = TimeCreator.setTime(10, 35);
        Time time2 = TimeCreator.setTime(11, 40, 12);

        int diffInSeconds = time1.differenceInSeconds(time2);
        System.out.println(diffInSeconds);

        time1.inc().inc().inc();
        System.out.println(time1);
    }
}
