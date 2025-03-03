import java.util.Scanner;
public class SumAgain{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int first = 0, second = 0, choice = 1;
        while(choice == 1){
            System.out.print("\nEnter first number: ");
            first = input.nextInt();
            System.out.print("Enter second number: ");
            second = input.nextInt();
            System.out.println(first + " + " + second + " = " + (first + second));
            System.out.print("Continue (1 for yes, any other number for no)? ");
            choice = input.nextInt();
        }
        System.out.println("Done and dusted.");
        input.close();
    }
}