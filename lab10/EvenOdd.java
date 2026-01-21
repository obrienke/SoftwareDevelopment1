import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;

        System.out.print("Enter number: ");
        x = input.nextInt();
        System.out.print(x);
        if((x %= 2) == 0){
            System.out.println(" is an even number");
        }else{
            System.out.println(" is an odd number");
        }
        input.close();
    }
}
