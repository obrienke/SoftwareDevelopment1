//exercise 2
import java.util.Scanner;
public class OneOrTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter 1 or 2: ");
        number = input.nextInt();

        if(number == 1 || number == 2){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
        input.close();
    }
    
}
