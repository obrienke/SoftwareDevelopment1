package week10;
import java.util.Scanner;
public class Decisions {
    public static void main(String[] args) {
        int x = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x = input.nextInt();
        if(x > 0){
            System.out.println("is greater than 1");
        }else{
            System.out.println("is not greater than 1");
        }
        input.close();
    }
}
