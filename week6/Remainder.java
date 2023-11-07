import java.util.Scanner;

public class Remainder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int result = 0;

        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();

        result = first % second;

        System.out.println(first + " / " + second + " = " + (first / second) + " remainder " + result);

        input.close();
    }
}