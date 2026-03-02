import java.util.Scanner;
public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1, number = 0, pos = 0, neg = 0, zero = 0;

        while(choice == 1){
            System.out.print("Enter number: ");
            number = input.nextInt();
            if(number > 0){
                pos++;
            }else if(number < 0){
                neg++;
            }else{
                zero++;
            }
            System.out.print("Continue - enter 1 for yes: ");
            choice = input.nextInt();
        } 
        System.out.println("Positive Total: " + pos);
        System.out.println("Negative Total: " + neg);
        System.out.println("Zero Total: " + zero);   

        input.close();
    }
}
