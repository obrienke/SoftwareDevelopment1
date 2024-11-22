import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;

        System.out.print("Enter a number: ");
        x = input.nextInt();
        if(x % 2 == 0){
            System.out.println(x + " is an even number.");
        }
        if(x % 2 != 0){
            System.out.println(x + " is an odd number.");
        }
        input.close();
    }
}
