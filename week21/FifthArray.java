package week21;
import java.util.Scanner;
public class FifthArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[8];
        double total = 0; 
        for(int idx = 0; idx < numbers.length; idx++){
            System.out.print("Enter value for element " + (idx + 1) + ": ");
            numbers[idx] = input.nextInt();
            total += numbers[idx];
        }
        System.out.println();
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(i + "\t" + numbers[i]);
        }
        System.out.println("\nAverage: " + (total / numbers.length));
        input.close();
    }
}
