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
        float result = 0;
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);//result = Math.round(result * 100.0) / 100.0;
        System.out.println("Round to 2 decimal places: " + Math.round(result * 100.0) / 100.0);
        System.out.println("Round to 3 decimal places: " + Math.round(result * 1000.0) / 1000.0);
        result = Math.round(result * 10000) / 10000.0f; 
        // Note divide by 10000.0f, postfix f, if value is getting assigned to variable of type float.
        // Otherwise, if no postfix f, 10000.0, used instead, you get an error as the value of the 
        // result will end up as a value of type double. float is 32 bit and can't accept a value of 64-bit
        // which is double. Float is too small for double. 
        // If getting assigned to a variable of type double then divide by 10000.0, no postfix f. 

        System.out.println("Round to 4 decimal places: " + result);
        System.out.println("4 + 2 * 8 - 4 / 2 = " + (4 + 2 * 8 - 4 / 2)); // * and / before + and -
        input.close();
    }
}
