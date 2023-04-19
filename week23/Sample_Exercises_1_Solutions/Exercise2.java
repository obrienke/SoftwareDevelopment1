import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();
       
        System.out.println();
        System.out.println("(" + first + " + " + second + ") * 4 = " + ((first + second) * 4));
        input.close();
    }
}
