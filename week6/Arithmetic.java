import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args) {

        // 1. Declare my variables
        Scanner input = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int result = 0;

        // 2. Prompt for values and store those values
        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();
        
        /*String a = "2";
        String b = "4";
        System.out.println("Result: " + (a + b));
        */
        // 3. Perform addition
        result = x + y;
        System.out.println("Result of addition is: " + result);

        // 4. Perform Subtraction
        result = x - y;
        System.out.println("Result of subtraction is: " + result);
        input.close();

        // 5. Rounding numbers
        double first = 2.34578;
        double second = 12.48464;
        double product = first * second;
        System.out.println("Decimal number result: " + product);

        // 6. Round to whole number, no decimal places
        product = Math.round(product);
        System.out.println("Decimal number rounded: " + product);
        // 7. Round to 1 decimal places
        product = first * second;
        product = Math.round(product * 10.0) / 10.0;
        System.out.println("Decimal number rounded to 1 decimal place: " + product);
        // 8. Round to 2 decimal places
        product = first * second;
        product = Math.round(product * 100.0) / 100.0;
        System.out.println("Decimal number rounded to 2 decimal place: " + product);
        // 9. Round to 3 decimal places
        product = first * second;
        product = Math.round(product * 1000.0) / 1000.0;
        System.out.println("Decimal number rounded to 3 decimal place: " + product);
        // 10. Round to 4 decimal places
        product = first * second;
        product = Math.round(product * 10000.0) / 10000.0;
        System.out.println("Decimal number rounded to 4 decimal place: " + product);
    }
}