import java.util.Scanner;
public class LoopExample{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 1;
        do{
            System.out.print("Enter any other value than 0 to exit loop: ");
            count = input.nextInt();           
        }while(count == 0);
    }
}