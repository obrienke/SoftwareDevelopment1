package week10;
import java.util.Scanner;
public class WhichNumberSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        System.out.print("Enter a number: ");
        x = input.nextInt();
        switch(x){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("not allowed");
        }
        input.close();
    }
}
