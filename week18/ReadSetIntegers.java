import java.util.Scanner;
public class ReadSetIntegers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0, even = 0, odd = 0, choice = 1, any = 0;
        System.out.print("Enter some digits (1 for yes, any other number for no)? ");
        choice = input.nextInt();
        while(choice == 1){
            System.out.print("\nEnter number: ");
            number = input.nextInt();
            if(number%2 == 0){
                even += number;
            }else{
                odd += number;
            }
            System.out.print("Continue (1 for yes, any other number for no)? ");
            choice = input.nextInt();
            any++;
        }
        if(any > 0){
            System.out.println("\nSum of even numbers is: " + even);
            System.out.println("Sum of odd numbers is: " + odd);
        }else{
            System.out.println("No numbers entered.");
        }
        input.close();
    }
}