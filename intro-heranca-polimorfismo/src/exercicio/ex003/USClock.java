package exercicio.ex003;

public class USClock extends Clock {

    private String meridiemIndicator;

    public USClock() {
        super();
    }

    public USClock(int hour, int minute, int second, String meridiemIndicator) {
        super(hour, minute, second);
        this.meridiemIndicator = meridiemIndicator;
    }


    @Override
    public String getTime() {
        return hour + ":" + minute + ":" + second + " " + meridiemIndicator;
    }

    @Override
    protected boolean isValidHour(int hour) {
        return 0 <= hour && hour <= 12;
    }

    @Override
    protected boolean isValidMinute(int minute) {
        return 0 <= minute && minute <= 59;
    }

    @Override
    protected boolean isValidSecond(int second) {
        return 0 <= second && second <= 59;
    }

    @Override
    protected boolean isValidTime(int hour, int minute, int second) {
        return isValidHour(hour) && isValidMinute(minute) && isValidSecond(second);
    }
}
