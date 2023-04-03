import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int first = 0, last = 0;
        System.out.print("Enter first number: ");
        first = kb.nextInt();
        System.out.print("Enter second number: ");
        kb.nextInt();
        System.out.print("Enter third number: ");
        kb.nextInt();
        System.out.print("Enter fourth number: ");
        last = kb.nextInt();
        System.out.println(first + " * " + last + " = " + (first * last));
        kb.close();
    }
}
