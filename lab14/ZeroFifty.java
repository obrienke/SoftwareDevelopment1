import java.util.Scanner;
public class ZeroFifty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        do{
            System.out.print("Enter number between 1 and 50: ");
            number = input.nextInt();
        }while(number > 0 && number < 50);
        System.out.println("End");
        input.close();
    }
}
