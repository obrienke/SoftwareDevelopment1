import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0, y = 0, sum = 0;
        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();

        sum = x + y;

        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        System.out.println(x + " % " + y + " = " + (x % y));

        float num1 = 23f, num2 = 6f;
        double result = 0f;
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);//result = Math.round(result * 100.0) / 100.0;
        System.out.println("Round to 2 decimal places: " + Math.round(result * 100.0) / 100.0);
        System.out.println("Round to 3 decimal places: " + Math.round(result * 1000.0) / 1000.0);
        result = Math.round(result * 10000.0) / 10000.0;
        System.out.println("Round to 4 decimal places: " + result);
        System.out.println("4 + 2 * 8 - 4 / 2 = " + (4 + 2 * 8 - 4 / 2)); // * and / before + and -
        input.close();
    }
}
