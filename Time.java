package converter.time;

public class Time {
    public double hoursToMinutes(double h) { return h * 60; }
    public double hoursToSeconds(double h) { return h * 3600; }
    public double minutesToHours(double m) { return m / 60; }
    public double secondsToHours(double s) { return s / 3600; }
}
