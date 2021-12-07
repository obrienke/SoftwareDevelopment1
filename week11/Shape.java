/* 
Program Template which can be used for Lab Exercises
*/

//uncomment next line if inputs are required in your program
import java.util.Scanner;

public class Shape{
	public static void main(String[] args){
		//uncomment next line if inputs are required in your program
		Scanner input = new Scanner(System.in);
		
		int choice = 0;
		
		System.out.println("What shape would you like to print out?");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.print("Enter your choice (1 or 2): ");
        choice = input.nextInt();

        switch(choice){
            case 1:
                System.out.println("* * * *");
                System.out.println("* * * *");
                System.out.println("* * * *");
                System.out.println("* * * *");
                break;
            case 2:
                System.out.println("      *");
                System.out.println("    * * * ");
                System.out.println("  * * * * *");
                System.out.println("* * * * * * *");
                break;   
            default:
                System.out.println("Invalid choice - can't print a shape");    
                      
        }
		
		//uncomment next line if inputs are required in your program
		input.close();	
	}
}