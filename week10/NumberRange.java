package week10;
import java.util.Scanner;

public class NumberRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number >= 10 && number <= 20){
            System.out.println("Number is range from 10 to 20");
        }else{
            System.out.println("Not in range");
        }
        input.close();
    }
}
