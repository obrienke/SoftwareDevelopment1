import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, number = 0;
        while(number != -1){
            System.out.print("Enter number (-1 to quit): ");
            number = input.nextInt();
            sum += number;
        }
        System.out.println("Sum of numbers is: " + ++sum);

        sum = 0;
        while(number != 0){
            System.out.print("Enter number (0 to quit): ");
            number = input.nextInt();
            sum += number;
        }
        System.out.println("Sum of numbers is: " + sum);
        input.close();
    }
}
