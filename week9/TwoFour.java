import java.util.Scanner;
public class TwoFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        if( (num1 == 2 && num2 ==4) || (num1 == 4 && num2 ==2) ){
            System.out.println("Numbers 4 and 2 entered");
        }else if ( (num1 == 2 || num2 == 4 || num1 == 4 || num2 == 2) ){
            if(num1 == 2 || num2 == 2){
                System.out.println("Number 2 was entered");
            }else{
                System.out.println("Number 4 was entered");
            }
        }else{ 
            System.out.println("Numbers 4 and 2 NOT entered");
        }
        
        input.close();
    }    
}
