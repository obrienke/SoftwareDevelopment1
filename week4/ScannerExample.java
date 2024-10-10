import java.util.Scanner;

public class ScannerExample{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1 = 0;

        System.out.print("Enter a number: ");
        number1 = input.nextInt();

        System.out.println("Number entered was " + number1);
        input.close();
    }
}

