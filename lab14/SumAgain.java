import java.util.Scanner;
public class SumAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0, again = 0;
        do{
            System.out.print("Enter first number: ");
            num1 = input.nextInt();
            System.out.print("Enter second number: ");
            num2 = input.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            System.out.print("Again - 1 for yes, any other number for no: ");
            again = input.nextInt();
        }while(again == 1);
        System.out.println("End of program");
        input.close();    
    }
}
