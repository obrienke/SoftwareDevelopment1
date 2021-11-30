/* 
Program Template which can be used for Lab Exercises
*/

//uncomment next line if inputs are required in your program
import java.util.Scanner;

public class OneOrTwo{
	public static void main(String[] args){
		//uncomment next line if inputs are required in your program
		Scanner input = new Scanner(System.in);
		int num = 0;

        System.out.print("Enter a number: ");
        num = input.nextInt();
		
        if(num == 1 || num == 2){
            System.out.println("Valid number");
        }else{
            System.out.println("Invalid number");
        }
		//uncomment next line if inputs are required in your program
		input.close();	
	}
}
