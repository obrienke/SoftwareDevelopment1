import java.util.Scanner;

public class Revision{
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        double c = 0.0;
        String name = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a whole number:");
        a = input.nextInt();
        System.out.print("Enter a decimal number:");
        c = input.nextDouble();
        System.out.print("Enter your name:");
        name = input.next();

        System.out.println(name + " you entered the numbers : " + a + " and " + c);

        System.out.print("Kevin");
        System.out.println(" O Brien");
        System.out.println(a + " * " + c + " = " + (a * c + b));

        System.out.println(a + " + " + b + " = " + a + b);
        System.out.println(a + " + " + b + " = " + (a + b));
        input.close();
    }
}