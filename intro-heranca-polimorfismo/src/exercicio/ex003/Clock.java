package exercicio.ex003;

public abstract class Clock {

    protected int hour;

    protected int minute;

    protected int second;

    public Clock() {

    }

    public Clock(int hour, int minute, int second) throws TimeFormatterException {
        if (!isValidTime(hour, minute, second))
            throw new TimeFormatterException("Os dados colocados são inválidos!");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) throws TimeFormatterException {
        if (!isValidHour(hour)) 
            throw new TimeFormatterException("Hora inválida!");
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) throws TimeFormatterException {
        if (!isValidMinute(minute))
            throw new TimeFormatterException("Minuto inválido!");
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) throws TimeFormatterException {
        if (!isValidSecond(second))
            throw new TimeFormatterException("Segundo inválido!");
        this.second = second;
    }

    public abstract String getTime();
    protected abstract boolean isValidTime(int hour, int minute, int second);
    protected abstract boolean isValidHour(int hour);
    protected abstract boolean isValidMinute(int minute);
    protected abstract boolean isValidSecond(int second);
}
