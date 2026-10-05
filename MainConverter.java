import converter.currency.Currency;
import converter.distance.Distance;
import converter.time.Time;
import java.util.Scanner;

public class MainConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Currency c = new Currency();
        Distance d = new Distance();
        Time t = new Time();

        System.out.println("========== CONVERTER APPLICATION ==========");
        System.out.println("1. Currency Converter");
        System.out.println("2. Distance Converter");
        System.out.println("3. Time Converter");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\n1.Dollar->INR 2.INR->Dollar 3.Euro->INR 4.INR->Euro 5.Yen->INR 6.INR->Yen");
                System.out.print("Enter choice: ");
                int ch1 = sc.nextInt();
                System.out.print("Enter amount: ");
                double a1 = sc.nextDouble();

                if (ch1 == 1) System.out.printf("%.2f Dollar = %.2f INR", a1, c.dollarToINR(a1));
                if (ch1 == 2) System.out.printf("%.2f INR = %.2f Dollar", a1, c.inrToDollar(a1));
                if (ch1 == 3) System.out.printf("%.2f Euro = %.2f INR", a1, c.euroToINR(a1));
                if (ch1 == 4) System.out.printf("%.2f INR = %.2f Euro", a1, c.inrToEuro(a1));
                if (ch1 == 5) System.out.printf("%.2f Yen = %.2f INR", a1, c.yenToINR(a1));
                if (ch1 == 6) System.out.printf("%.2f INR = %.2f Yen", a1, c.inrToYen(a1));
                break;

            case 2:
                System.out.println("\n1.Meter->KM 2.KM->Meter 3.Miles->KM 4.KM->Miles");
                System.out.print("Enter choice: ");
                int ch2 = sc.nextInt();
                System.out.print("Enter value: ");
                double a2 = sc.nextDouble();

                if (ch2 == 1) System.out.printf("%.2f Meter = %.2f KM", a2, d.meterToKM(a2));
                if (ch2 == 2) System.out.printf("%.2f KM = %.2f Meter", a2, d.kmToMeter(a2));
                if (ch2 == 3) System.out.printf("%.2f Miles = %.2f KM", a2, d.milesToKM(a2));
                if (ch2 == 4) System.out.printf("%.2f KM = %.2f Miles", a2, d.kmToMiles(a2));
                break;

            case 3:
                System.out.println("\n1.Hours->Minutes 2.Hours->Seconds 3.Minutes->Hours 4.Seconds->Hours");
                System.out.print("Enter choice: ");
                int ch3 = sc.nextInt();
                System.out.print("Enter value: ");
                double a3 = sc.nextDouble();

                if (ch3 == 1) System.out.printf("%.2f Hours = %.2f Minutes", a3, t.hoursToMinutes(a3));
                if (ch3 == 2) System.out.printf("%.2f Hours = %.2f Seconds", a3, t.hoursToSeconds(a3));
                if (ch3 == 3) System.out.printf("%.2f Minutes = %.2f Hours", a3, t.minutesToHours(a3));
                if (ch3 == 4) System.out.printf("%.2f Seconds = %.2f Hours", a3, t.secondsToHours(a3));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
