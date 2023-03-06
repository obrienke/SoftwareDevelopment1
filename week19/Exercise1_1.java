import java.util.Scanner;
public class Exercise1_1{
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;
        int number6 = 0;
        int number7 = 0;
        int number8 = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        number2 = input.nextInt();
        System.out.print("Enter number 3: ");
        number3 = input.nextInt();
        System.out.print("Enter number 4: ");
        number4 = input.nextInt();
        System.out.print("Enter number 5: ");
        number5 = input.nextInt();
        System.out.print("Enter number 6: ");
        number6 = input.nextInt();
        System.out.print("Enter number 7: ");
        number7 = input.nextInt();
        System.out.print("Enter number 8: ");
        number8 = input.nextInt();

        System.out.println(number1 + " * " + number2 + " = " + (number1 * number8));
        input.close();
    }
}