package exercicio.ex003;

public class BrazilianClock extends Clock {
    
    public BrazilianClock() {
        super();
    }

    public BrazilianClock(int hour, int minute, int second) {
        super(hour, minute, second);
    }


    @Override
    public String getTime() {
        return hour + ":" + minute + ":" + second;
    }

    @Override
    protected boolean isValidHour(int hour) {
        return 0 <= hour && hour <= 23;
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
