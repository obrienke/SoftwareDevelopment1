import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        System.out.print("Enter number 1: ");
        number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        number2 = input.nextInt();
        System.out.print("Enter number 3: ");
        number3 = input.nextInt();
        System.out.print("Enter number 4: ");
        number4 = input.nextInt();

        System.out.println("(" + number1 + " + " + number2 + " + " + number3 + " + " + number4 + ") * 4 = " 
                            + ((number1 + number2 + number3 + number4)*4));
        input.close();
    }
}
