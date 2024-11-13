import java.util.Scanner;
public class FirstDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int first = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        first = number / 1000;
        System.out.println("First digit of " + number + " is " + first);

        String num = "";
        System.out.print("Enter a number: ");
        num = input.next();
        System.out.println("First digit of " + num + " is " + num.charAt(0));
        input.close();
    }
}
