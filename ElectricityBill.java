import java.util.Scanner;

public class ElectricityBill {
    int consumerNo;
    String consumerName;
    int previousReading, currentReading, units;
    String type;
    double bill = 0;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer Number: ");
        consumerNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        consumerName = sc.nextLine();

        System.out.print("Enter Previous Reading: ");
        previousReading = sc.nextInt();

        System.out.print("Enter Current Reading: ");
        currentReading = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Connection Type (Domestic/Commercial): ");
        type = sc.nextLine();

        units = currentReading - previousReading;
    }

    void calculateBill() {
        if (type.equalsIgnoreCase("Domestic")) {
            if (units <= 100)
                bill = units * 1.5;
            else if (units <= 200)
                bill = (100 * 1.5) + (units - 100) * 3;
            else if (units <= 500)
                bill = (100 * 1.5) + (100 * 3) + (units - 200) * 4.5;
            else
                bill = (100 * 1.5) + (100 * 3) + (300 * 4.5) + (units - 500) * 7;
        } else if (type.equalsIgnoreCase("Commercial")) {
            if (units <= 100)
                bill = units * 2.5;
            else if (units <= 200)
                bill = (100 * 2.5) + (units - 100) * 5;
            else if (units <= 500)
                bill = (100 * 2.5) + (100 * 5) + (units - 200) * 6.5;
            else
                bill = (100 * 2.5) + (100 * 5) + (300 * 6.5) + (units - 500) * 9;
        }
    }

    void display() {
        System.out.println("\n------ Electricity Bill ------");
        System.out.println("Consumer Number : " + consumerNo);
        System.out.println("Consumer Name : " + consumerName);
        System.out.println("Connection Type : " + type);
        System.out.println("Units Consumed : " + units);
        System.out.println("Total Bill : Rs. " + bill);
    }

    public static void main(String args[]) {
        ElectricityBill eb = new ElectricityBill();
        eb.getData();
        eb.calculateBill();
        eb.display();
    }
}
