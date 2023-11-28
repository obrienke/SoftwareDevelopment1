// execise 2
import java.util.Scanner;
public class MultipleElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0, second = 0;

        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();

        if(first % second == 0){
            System.out.println(first + " is a multiple of " + second);
        }else{
            System.out.println(first + " is NOT a multiple of " + second);
        }
        input.close();
    }
}
