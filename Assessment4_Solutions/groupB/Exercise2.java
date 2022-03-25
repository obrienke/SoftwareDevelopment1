import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        
        System.out.print("Enter any number apart from ten: ");
        number = input.nextInt();
        
        if(number != 10){
            System.out.println("Number entered is not equal to 10.");
        }else{
            System.out.println("You are not allowed enter the number 10.");
        }

        input.close();
    }
}
