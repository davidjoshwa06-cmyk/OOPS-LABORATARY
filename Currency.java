package converter.currency;

public class Currency {
    final double DOLLAR = 83.50;
    final double EURO = 90.20;
    final double YEN = 0.55;

    public double dollarToINR(double d) { return d * DOLLAR; }
    public double inrToDollar(double i) { return i / DOLLAR; }
    public double euroToINR(double e) { return e * EURO; }
    public double inrToEuro(double i) { return i / EURO; }
    public double yenToINR(double y) { return y * YEN; }
    public double inrToYen(double i) { return i / YEN; }
}
