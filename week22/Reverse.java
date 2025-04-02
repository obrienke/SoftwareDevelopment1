import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.print("Enter a number (-1 to exit): ");
        num1 = input.nextInt();
        while(num1 != -1){
            System.out.println(reverseDigits(num1));
            System.out.print("Enter a number (-1 to exit): ");
            num1 = input.nextInt();
        }
        input.close();
    }

    static int reverseDigits(int number){
        int reverseNumber = 0;
        int placeValue = 0;

        while(number > 0){
            placeValue = number % 10;
            number = number / 10;
            reverseNumber = reverseNumber * 10 + placeValue;
        }

        return reverseNumber;
    }
}
