/* 
Program Template which can be used for Lab Exercises
*/

//uncomment next line if inputs are required in your program
import java.util.Scanner;

public class Arithmetic{
	public static void main(String[] args){
		//uncomment next line if inputs are required in your program
		Scanner input = new Scanner(System.in);
		
		//Declare and initialise program variables
		int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
        int result = 0;

		//Include prompts for inputs and assign inputs to variables
		System.out.println("Enter first number: ");
        first = input.nextInt();
		System.out.println("Enter second number: ");
        second = input.nextInt();
		System.out.println("Enter third number: ");
        third = input.nextInt();
		System.out.println("Enter fourth number: ");
        fourth = input.nextInt();

		//Other logic - arithmetic and decision making logic
		result = first + second + third + fourth;
		//Outputs
        System.out.println(first + " + " + second + " + " + third + " + " + fourth + " = " + result);
		
        //result = fourth - first;
        System.out.println(fourth + " - " + first + " = " + (fourth - first));
		//uncomment next line if inputs are required in your program
		input.close();	
	}
}
