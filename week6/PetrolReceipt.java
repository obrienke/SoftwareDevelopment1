import java.util.Scanner;
public class PetrolReceipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, time, date;
        double litres, price, total;

        System.out.print("Enter garage name: ");
        name = input.next();
        System.out.print("Enter number of litres: ");
        litres = input.nextDouble();
        System.out.print("Enter price per litre: ");
        price = input.nextDouble();
        System.out.print("Enter time (HH:MI): ");
        time = input.next();
        System.out.print("Enter date (dd-mon-yyyy): ");
        date = input.next();

        total = price * litres;
        total = Math.round(total * 100.0) / 100.0;

        System.out.println("Total: " + total);
        System.out.println("+----------------------+");
        System.out.println("|                      |");
        System.out.println("|  " + name + "               |");
        System.out.println("|                      |");
        System.out.println("| " + date + " " + time + "    |");
        System.out.println("|                      |");
        System.out.println("|  Litres:\t " + litres + "  |");
        System.out.println("|  Price/litre:\t " + price + "  |");
        System.out.println("|                      |");
        System.out.println("|  Fuel Total:\t " + total + " |");
        System.out.println("|                      |");
        System.out.println("+----------------------+");
        input.close();
    }
}
