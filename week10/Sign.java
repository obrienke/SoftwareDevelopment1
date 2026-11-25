package week10;
import java.util.Scanner;
public class Sign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number > 0){
            System.out.println("Positive");
        }else if(number < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
        input.close();
    }
}
