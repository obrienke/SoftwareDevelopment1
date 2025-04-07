import java.util.Scanner;
public class Sample2_Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Enter number: ");
        x = input.nextInt();
        System.out.print("Enter another number: ");
        y = input.nextInt();
        
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " * " + y + " = " + (x * y));

        input.close();
    }
}
