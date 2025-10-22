import java.util.Scanner;
public class Arithmetic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        double num3 = 0, rounded = 0;

        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        System.out.print("Enter third number: ");
        num3 = input.nextDouble();
        rounded = Math.round(num3 * 10) / 10.0;
        System.out.println(num3 + " rounded to 1 decimal place is " + rounded);
        System.out.println(num3 + " rounded to 2 decimal place is " + (Math.round(num3 * 100) / 100.0));
        input.close();
    }
}