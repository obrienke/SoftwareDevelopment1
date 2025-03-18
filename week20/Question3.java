import java.util.Scanner;

public class Question3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 1;
        int count = 0;
        
        while(number > 0){
            System.out.print("Enter a positive number (Enter value less than 1 to stop): ");
            number = input.nextInt();
            if(number > 0){
                count++;
            }
        }

        System.out.println("You entered " + count + " positive numbers.");
        input.close();
    }
}
