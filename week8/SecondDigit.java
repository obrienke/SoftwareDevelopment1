import java.util.Scanner;
public class SecondDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int first = 0, second = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        first = number % 1000;
        second = first / 100;

        System.out.println("Second digit of " + number + " is " + second);

        input.close();
    }
    
}
