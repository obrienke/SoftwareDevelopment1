import java.util.Scanner;

public class Example1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;

        System.out.print("Enter number: ");
        a = input.nextInt();
        System.out.print("Enter number: ");
        b = input.nextInt();
        System.out.print("Enter number: ");
        c = input.nextInt();
        System.out.print("Enter number: ");
        d = input.nextInt();

        System.out.println("Sum of numbers is: " + (a + b + c + d));
        input.close();
    }
}