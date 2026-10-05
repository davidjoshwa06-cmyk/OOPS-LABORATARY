package converter.distance;

public class Distance {
    public double meterToKM(double m) { return m / 1000; }
    public double kmToMeter(double k) { return k * 1000; }
    public double milesToKM(double mi) { return mi * 1.60934; }
    public double kmToMiles(double k) { return k / 1.60934; }
}
