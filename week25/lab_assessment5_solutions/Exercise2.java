import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        double first = 0;
        double second = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        first = input.nextDouble();
        System.out.print("Enter second number: ");
        second = input.nextDouble();
       
        System.out.println();
        System.out.println(first + " / " + second + " = " + Math.round((first / second) * 1000.0)/1000.0);
        System.out.println(first + " * " + second + " = " + Math.round((first * second) * 1000.0)/1000.0);

        input.close();
    }
}
