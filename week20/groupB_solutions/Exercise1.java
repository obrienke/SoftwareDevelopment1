import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int first = 0, second = 0, third = 0, fourth = 0, fifth = 0;
        System.out.print("Enter first number: ");
        first = kb.nextInt();
        System.out.print("Enter second number: ");
        second = kb.nextInt();
        System.out.print("Enter third number: ");
        third = kb.nextInt();
        System.out.print("Enter fourth number: ");
        fourth = kb.nextInt();
        System.out.print("Enter fifth number: ");
        fifth = kb.nextInt();
        System.out.println(first + " * " + second + " * " + third + " * " + fourth + " * " + fifth + " = " + (first * second * third * fourth * fifth));
        kb.close();
    }
}
