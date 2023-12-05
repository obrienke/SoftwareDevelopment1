// exercise 5
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0, second = 0;
        char operator = 'x';
        boolean valid = true;
        int result = 0;
        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();
        System.out.print("Enter operator (a, s, m, or d): ");
        operator = input.next().toLowerCase().charAt(0);

        switch(operator){
            case 'a':
                result = first + second;
                operator = '+';
                break;
            case 's':
                result = first - second;
                operator = '-';
                break;
            case 'm':
                result = first * second;
                operator = '*';
                break;
            case 'd':
                result = first / second;
                operator = '/';
                break;
            default:
                valid = false;
        }

        if(valid){
            // 4 + 2 = 6
            System.out.println(first + " " + operator + " " + second + " = " + result);
        }else{
            System.out.println("Invalid operator. Must be a, s, m or d");
        }

        input.close();
    }    
}
