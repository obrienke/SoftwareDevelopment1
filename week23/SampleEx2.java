/*
 * Name: Kevin
 * Date: 02/04/2025
 * Program: SampleEx2
 */
import java.util.Scanner;
public class SampleEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Declare new scanner
        int first, second;
        System.out.print("Enter first number: ");// enter first number
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();
        int result = (first + second) * 4; // perform simple calculation
        System.out.println("(" + first + " + " + second + ") * 4 = " + result);
        input.close();
    }
}
