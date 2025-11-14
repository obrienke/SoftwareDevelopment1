import java.util.Scanner;
public class Multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        System.out.print("Enter a number: ");
        number1 = input.nextInt();
        System.out.print("Enter another number: ");
        number2 = input.nextInt();
        if(number1 % number2 == 0){
            System.out.println(number1 + " is a multiple of " + number2);
        }
        if(number1 % number2 != 0){
            System.out.println(number1 + " is a NOT multiple of " + number2);
        }
        input.close();
    }
}
