import java.util.Scanner;
public class CountNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0, pos = 0, neg = 0, zero = 0, choice = 1, any = 0;
        System.out.print("Enter some digits (1 for yes, any other number for no)? ");
        choice = input.nextInt();
        while(choice == 1){
            System.out.print("\nEnter number: ");
            number = input.nextInt();
            if(number > 0){
                pos++;
            }else if(number < 0){
                neg++;
            }else{
                zero++;
            }
            System.out.print("Continue (1 for yes, any other number for no)? ");
            choice = input.nextInt();
            any++;
        }
        if(any > 0){
            System.out.println("\nPositive Numbers: " + pos);
            System.out.println("Negative Numbers: " + neg);
            System.out.println("Number of zeros: " + zero);
        }else{
            System.out.println("No numbers entered.");
        }
        input.close();
    }
}