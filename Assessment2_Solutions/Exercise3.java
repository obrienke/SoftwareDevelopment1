import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0;
        int second = 0;
        System.out.println();
        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();
        System.out.println();
        System.out.println("Result of adding the two numbers is: " + (first + second));
        System.out.println("Result of multiplying the two numbers is: " + (first * second));
        System.out.println();
        input.close();
    }
}
