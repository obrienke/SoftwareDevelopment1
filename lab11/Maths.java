import java.util.Scanner;
public class Maths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, choice;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("Enter second number: ");
        number2 = input.nextInt();
        System.out.println("Choose arithmetic option:");
        System.out.println("1. Add");
        System.out.println("2. Substract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Choice: ");
        choice = input.nextInt();

        switch(choice){
            case 1:
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case 2:
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case 3:
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case 4:
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                break;
            default:
                System.out.println("Invalid choice");
        }
        input.close();
    }
}
