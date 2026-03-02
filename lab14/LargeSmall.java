import java.util.Scanner;
public class LargeSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0, choice = 0, large = 0, small = 0;
        boolean flag = false;
        System.out.print("Enter numbers (1 for yes): ");
        choice = input.nextInt();
        if(choice == 1){
            System.out.print("Enter number: ");
            number = input.nextInt();
            large = number;
            small = number;
            flag = true;
        }
        while(choice == 1){
            if(number > large){
                large = number;
            }
            if(number < small){
                small = number;
            }
            System.out.print("Enter numbers (1 for yes): ");
            choice = input.nextInt();
            if(choice == 1){
                System.out.print("Enter number: ");
                number = input.nextInt();
            }
        }
        if(flag){
            System.out.println("Largest: " + large);
            System.out.println("Smallest: " + small);
        }else{
            System.out.println("No numbers entered");
        }
        input.close();
    }
}
