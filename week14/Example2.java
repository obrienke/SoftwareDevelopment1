// Example 1 rewritten using a loop
import java.util.Scanner;
public class Example2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int count = 1; // 1. initialiser
        while(count <= 4){ //2. condition
            // 3. code
            System.out.print("Enter number " + count + ": ");
            a += input.nextInt();
            count++; // 4. incrementor
        }
        
        System.out.println("Sum of numbers is: " + a);
        input.close();
    }
}