import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int result = 0;

        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();

        result = (x + y) * 4;

        System.out.println();
        System.out.println("(" + x + " + " + y + ") * 4 = " + result);
        input.close();
    }
}
