// Exercise 4
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number%2 == 0){
            System.out.println(number + " is an even number.");
        }else{
            System.out.println(number + " is an odd number.");
        }
        input.close();
    }
}
