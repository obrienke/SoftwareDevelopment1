import java.util.Scanner;

public class Question2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        int times = 12;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number >= 3){
            times = 6;
        }
        
        for(int i = 1; i <= times; i++){
            System.out.println(i + ". Question 2");
        }
        input.close();
    }
}
