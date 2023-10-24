import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0, y = 0, result = 0;

        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();

        result = x + y;
        System.out.println(x + " + " + y + " = " + result);
        result = x - y;
        System.out.println(x + " - " + y + " = " + result);
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        System.out.println(x + " % " + y + " = " + (x % y));

        int res = 2 + 5 * 3 - 4 / 2;
        System.out.println("2 + 5 * 3 - 4 / 2 = " + res);  
        res = (2 + 5) * (3 - 4 / 2);  
        System.out.println("(2 + 5) * (3 - 4 / 2) = " + res);

        double first = 44;
        double second = 1.152;
        double product = first * second;

        System.out.println("44 * 1.152 = " + product); //44 * 1.152 = 50.687999999999995
        System.out.println("44 * 1.152 = " + ((Math.round(product * 100))/100.0)); // result round to two places

        input.close();
    }
}