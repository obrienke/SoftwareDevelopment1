//exercise 1
import java.util.Scanner;
public class OneToTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a value from 1 to 10: ");
        number = input.nextInt();

        if(number >= 1 && number <= 10){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
        input.close();
    }
}
