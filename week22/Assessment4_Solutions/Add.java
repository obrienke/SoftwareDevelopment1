import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0, y = 0;
        String name = "";

        System.out.print("\nEnter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();
        System.out.print("Enter your name: ");
        name = input.next();

        System.out.println("\n" + name + ", you entered the numbers " + x + " and " +y + ".");
        System.out.println("The result of adding these two numbers together is: ");
        System.out.println(x + y + "\n");

        input.close();
    }
}
