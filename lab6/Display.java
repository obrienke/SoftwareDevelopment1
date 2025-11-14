import java.util.Scanner;
public class Display {
    public static void main(String[] args) {
        // exercise 1
        int x = 2;
        int y = 3;
        System.out.printf("x = %d%n", x);
        System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
        System.out.printf("x =%n");
        System.out.printf("%d = %d%n", (x + y), (y + x)); 
        System.out.printf("x = %d%n", 2);
        
        // exercise 2
        System.out.printf("%s%n%s%n%s%n", "Line 1", "Line 2", "Line 3");

        // exercise 3
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        x = input.nextInt();
        System.out.printf("Enter another number: ");
        y = input.nextInt();
        System.out.printf("Numbers entered were %d and %d%n", x, y);

        // exercise 4
        double first, second;
        System.out.printf("Enter a number: ");
        first = input.nextDouble();
        System.out.printf("Enter another number: ");
        second = input.nextDouble();
        System.out.printf("Numbers entered were %.1f and %.1f%n", first, second);

        input.close();
    }
}
