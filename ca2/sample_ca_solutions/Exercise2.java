import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, num3;

        System.out.println();    
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();
        System.out.print("Enter third number: ");
        num3 = input.nextDouble();

        System.out.println();
        System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + (num1 * num2 * num3));

        // round the result to 2 decimal places.
        System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + (Math.round((num1 * num2 * num3) * 100.0) / 100.0));

        
        System.out.println();
        input.close();
    }
}
