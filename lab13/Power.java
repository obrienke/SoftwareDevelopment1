import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0, digit = 0, number = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        for(; number > 0; number /= 10){
            digit = number % 10;
            System.out.println(digit + "^" + digit + " = " + Math.pow(digit, digit));
            total += Math.pow(digit, digit);
        }
        System.out.println("Sum of values: " + total);
        input.close();
    }
}
