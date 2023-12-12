import java.util.Scanner;
public class LargeSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;
        int largest = 0;
        int smallest = 0;

        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        largest = num1;
        smallest = num1;

        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        if(num2 > largest){
            largest = num2;
        }
        if(num2 < smallest){
            smallest = num2;
        }

        System.out.print("Enter third number: ");
        num3 = input.nextInt();

        if(num3 > largest){
            largest = num3;
        }
        if(num3 < smallest){
            smallest = num3;
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        input.close();
    }
}
