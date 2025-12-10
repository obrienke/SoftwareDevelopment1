import java.util.Scanner;
public class Exercise3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter number: ");
        number = input.nextInt();
        
        if(number < 100){
            System.out.println(number + " is less than 100.");
        }else{
            System.out.println(number + " is NOT less than 100.");
        }
        
        input.close();
    }
}