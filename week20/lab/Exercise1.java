import java.util.Scanner;
public class Exercise1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        System.out.print("Enter number 1: ");
        number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        number2 = input.nextInt();
        System.out.print("Enter number 3: ");
        number3 = input.nextInt();
        int result = (number1 * 2) + (number2 * 4) + (number3 * 8);
        System.out.println("(" + number1 + " * 2) + (" 
                            + number2 + " * 4) + (" + number3 +
                            " * 8) = " + result);
                            
        input.close();
    }
}