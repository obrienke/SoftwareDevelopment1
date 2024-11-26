import java.util.Scanner;
public class DoubleSelection{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.println("Enter a number");
        number = input.nextInt();

        if(number == 1){
            System.out.print("Number entered was 1");
        }

        input.close();
    }
}