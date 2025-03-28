import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        //System.out.println("Exercise 1: " + args[0] + " and " + args[1]);
        Scanner input = new Scanner(System.in);
        int first = 0, second = 0;
        int prompt = 1;
        do{
            System.out.print("Enter first number: ");
            first = input.nextInt();
            System.out.print("Enter second number: ");
            second = input.nextInt();
            System.out.println(first + " * " + second + " = " + (first * second));
            System.out.print("More multiplication, enter 1 for yes: ");
            prompt = input.nextInt();
        }while(prompt == 1);
        
        //input.close(); // Do not close scanner as it impacts scanner in Menu.java
    }
}
