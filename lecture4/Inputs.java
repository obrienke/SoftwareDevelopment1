import java.util.Scanner;
public class Inputs{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        String name = "";
        double decimalNumber = 0;

        System.out.print("Enter a whole number: ");
        number = input.nextInt();

        System.out.print("Enter name: ");
        name = input.next();

        System.out.print("Enter a decimal number: ");
        decimalNumber = input.nextDouble();

        System.out.println("Number entered: " + number);
        System.out.println("Name entered: " + name);
        System.out.println("Number entered: " + decimalNumber);
        input.close();

        System.out.println("Name updated: " + name.concat(" ").concat("Murphy"));
    }
}