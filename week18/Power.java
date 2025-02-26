import java.util.Scanner;
public class Power{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0, total = 0, digit = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for(int i = number; i > 0; i /= 10){
            digit = i % 10;
            total += Math.pow(digit, digit);
            System.out.println(digit + " ^ " + digit + " = " + Math.pow(digit, digit));
        }

        System.out.println("Sunm of digits raised to themselves: " + total);
        input.close();
    }
}