package week10;
import java.util.Scanner;

public class FourOrTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number == 2 || number == 4){
            System.out.println("Number is 4 or 2");
        }else{
            System.out.println("Number is not 4 or 2");
        }
        input.close();
    }
}
