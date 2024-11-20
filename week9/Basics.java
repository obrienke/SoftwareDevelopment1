/* A program to demonstrate some of the basics of printf() */

public class Basics{
    public static void main(String[] args) {
        String product = "Red T-Shirt";
        int qty = 10;
        double unitPrice = 4.95;

        System.out.println("Product: " + product + "\nQuantity: " + qty + "\nUnit Price: " + unitPrice);
        System.out.println("Total price: " + (qty * unitPrice));

        System.out.println();
        System.out.printf("Product: " + product + "\nQuantity: " + qty + "\nUnit Price: " + unitPrice + "\n");
        System.out.println();
        System.out.printf("Product: %s%nQuantity: %d%nUnit Price: %.2f%nTotal Price: %.2f%n", product, qty, unitPrice, (qty * unitPrice));

        System.out.println("3.45673446 / 1.345435346 = " + (3.45673446 / 1.345435346));
        System.out.printf("%.4f / %.4f = %.2f%n", 3.45673446, 1.345435346, (3.45673446 / 1.345435346));

        System.out.println();
        System.out.printf("%10.4s %10.5s%n", "Name", "Score");

        System.out.printf("%-10s %-10s%n", "Name", "Score");
        System.out.printf("%-10s %d%n", "May", 64);
        System.out.printf("%-10s %d%n", "June", 74);

        int day = 19;
        int month = 11;
        int year = 2024;
        System.out.printf("%d/%d/%d%n", day, month, year); // 19/11/2024

        day = 8;
        month = 1;
        year = 2026;
        System.out.printf("%d/%d/%d%n", day, month, year); // 8/1/2026

        System.out.printf("%02d/%02d/%d%n", day, month, year); // 08/01/2026
        day = 18;
        System.out.printf("%02d/%02d/%d%n", day, month, year); // 18/01/2026
    }
}