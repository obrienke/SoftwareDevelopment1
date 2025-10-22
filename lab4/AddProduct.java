import java.util.Scanner;
public class AddProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first, second, third, sum, product;
        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();
        System.out.print("Enter third number: ");
        third = input.nextInt();
        sum = first + second + third;
        product = first * second * third;
        System.out.println(first + " + " + second + " + " + third + " = " + sum);
        System.out.println(first + " * " + second + " * " + third + " = " + product);
        input.close();
    }
}
