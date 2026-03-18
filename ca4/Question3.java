import java.util.Scanner;
public class Question3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = -1, number = 1;
        
        while(number > 0){
            total++;
            System.out.print("Enter a number (less than 0 to quit): ");
            number = input.nextInt();
        }
        System.out.println("You entered " + total + " positive numebrs.");
        number = 0;
        total = -1;
        do{
            total++;
            System.out.print("Enter a number (less than 0 to quit): ");
            number = input.nextInt();
        }while(number > 0);
        System.out.println("You entered " + total + " positive numebrs.");
        input.close();
    }
}
