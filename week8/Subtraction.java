import java.util.Scanner;
public class Subtraction{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = 0, y = 0;

        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();
        System.out.println(x + " - " + y + " = " + (x - y));
        input.close();
    }
}