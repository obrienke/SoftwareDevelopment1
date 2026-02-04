import java.util.Scanner;
public class FifthLoop {
    public static void main(String[] args) {
        int x = 1, number = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = input.nextInt();
        while(x <= number){
            System.out.println("Loop counter: " + x);
            x++;
        }
        input.close();
    }
}
