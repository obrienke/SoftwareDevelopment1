import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = null;
        int number = 0;
        float dec = 0;

        System.out.print("Enter your name: ");
        firstName = input.next();
        System.out.println("First name: " + firstName);
        
        System.out.print("Enter a whole number: ");
        number = input.nextInt();

        System.out.print("Enter a decimal number: ");
        dec = input.nextFloat();

        System.out.println(number + " and " + dec);
        input.close();
    }
}
