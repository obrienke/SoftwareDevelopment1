import java.util.Scanner;
public class AddProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int third = 0;
        int result = 0;

        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();
        System.out.print("Enter third number: ");
        third = input.nextInt();

        result = first + second + third;
        System.out.println(first + " + " + second + " + " + third + " = " + result);
        result = first * second * third;
        System.out.println(first + " * " + second + " * " + third + " = " + result);

        input.close();
    }
}
