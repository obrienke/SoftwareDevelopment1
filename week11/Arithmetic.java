import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first, second, third, fourth;
        System.out.println();
        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();
        System.out.print("Enter third number: ");
        third = input.nextInt();
        System.out.print("Enter fourth number: ");
        fourth = input.nextInt();
        System.out.println();
        System.out.println(first + " + " + second + " + " + third + " + " + fourth + " = " + (first + second + third + fourth));
        System.out.println(fourth + " - " + first + " = " + (fourth - first));
        System.out.println();
        input.close();
    }
}
